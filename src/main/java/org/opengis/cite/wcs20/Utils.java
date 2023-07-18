package org.opengis.cite.wcs20;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.CoordinateSequence;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.impl.CoordinateArraySequence;

import net.sf.saxon.om.NodeInfo;
import net.sf.saxon.value.TextFragmentValue;

public class Utils {

    private static GeometryTransformer geometryTransformer;

    private static DecimalFormat df = new DecimalFormat("#.############");

    public static boolean transformCoordinates(Object low1,
            Object low2,
            Object high1,
            Object high2,
            Object posList,
            Object srcCrs,
            Object targetCrs) {

        String low1String = getStringvalue(low1);
        String low2String = getStringvalue(low2);
        String high1String = getStringvalue(high1);
        String high2String = getStringvalue(high2);
        String posListString = getStringvalue(posList);
        String srcCrsString = getStringvalue(srcCrs);
        String targetCrsString = getStringvalue(targetCrs);

        geometryTransformer = new GeometryTransformer(targetCrsString, srcCrsString);

        List<Double> xyList = createXyList(posListString);

        return containsWithTransformation(low1String, low2String, xyList)
                && containsWithTransformation(high1String, high2String, xyList);
    }

    private static List<Double> createXyList(String posListString) {
        String[] xyArray = posListString.split(" ");
        List<Double> xyList = new ArrayList<Double>(xyArray.length);
        for (String xy : xyArray) {
            xyList.add(Double.parseDouble(xy));
        }
        return xyList;
    }

    private static boolean containsWithTransformation(String x,
            String y,
            List<Double> xyList) {
        Point point = createPoint(x, y);
        Point transformedPoint = geometryTransformer.transform(point);
        String transformedX = df.format(transformedPoint.getX());
        String transformedY = df.format(transformedPoint.getY());
        return contains(transformedX, xyList) && contains(transformedY, xyList);
    }

    private static boolean contains(String xy,
            List<Double> xyList) {
        return xyList.stream().anyMatch(x -> df.format(x).equals(xy));
    }

    private static Point createPoint(String x,
            String y) {
        Coordinate c = new Coordinate(Double.parseDouble(x), Double.parseDouble(y));
        Coordinate[] coordinateArray = new Coordinate[] { c };
        CoordinateSequence coordinateSequence = new CoordinateArraySequence(coordinateArray);
        Point point = new Point(coordinateSequence, geometryTransformer.getGeometryFactory());
        return point;
    }

    private static String getStringvalue(Object o) {
        if (o instanceof ArrayList<?>) {
            ArrayList<?> list = (ArrayList<?>) o;
            if (list.size() > 0) {
                Object firstListItem = list.get(0);
                if (firstListItem instanceof NodeInfo) {
                    String value = ((NodeInfo) firstListItem).getStringValue();
                    return value;
                }
            }
        }else if(o instanceof TextFragmentValue) {
            return ((TextFragmentValue)o).getStringValue();
        }
        return null;
    }

}
