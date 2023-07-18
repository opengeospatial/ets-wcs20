package org.opengis.wcs20.test;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.CoordinateSequence;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.impl.CoordinateArraySequence;
import org.opengis.cite.wcs20.GeometryTransformer;

public class GeometryTransformTest {

    private static GeometryTransformer geometryTransformer;

    private static DecimalFormat df = new DecimalFormat("#.############");
    
    public static void main(String[] args) {


        String low1String = "-16704881.0872000009";
        String low2String = "1108912.52541457303";
        String high1String = "-11124991.6111871637";
        String high2String = "9624853.57110000029";
        String posListString = "65.0624999998731 -150.062500000309 65.0624999998731 -99.9375000003089 9.91172075719745 -99.9375000003089 9.91172075719745 -150.062500000309 65.0624999998731 -150.062500000309";
        String srcCrsString = "EPSG:4326";
        String targetCrsString = "http://www.opengis.net/def/crs/EPSG/0/3857";

        geometryTransformer = new GeometryTransformer(targetCrsString, srcCrsString);
        
        Point point = createPoint(low1String, low2String);
        
        Point transformedPoint = geometryTransformer.transform(point);   

        List<Double> xyList = createXyList(posListString);
        
        boolean result = containsWithTransformation(low1String, low2String, xyList) && containsWithTransformation(high1String, high2String, xyList);
        System.out.println(result);
        
    }
    
    private static List<Double> createXyList(String posListString){        
        String[] xyArray = posListString.split(" ");        
        List<Double> xyList = new ArrayList<Double>(xyArray.length);   
        for (String xy : xyArray) {
              xyList.add(Double.parseDouble(xy));
        }   
        return xyList;
    }
    
    private static boolean containsWithTransformation(String x, String y, List<Double> xyList) {
        Point point = createPoint(x, y);        
        Point transformedPoint = geometryTransformer.transform(point);        
        String transformedX = df.format(transformedPoint.getX());
        String transformedY = df.format(transformedPoint.getY());
        return contains(transformedX, xyList) && contains(transformedY, xyList);
    }
    
    private static boolean contains(String xy, List<Double> xyList) {
        return xyList.stream().anyMatch(x -> df.format(x).equals(xy));
    }
    
    private static Point createPoint(String x, String y) {        
        Coordinate c = new Coordinate(Double.parseDouble(x), Double.parseDouble(y));        
        Coordinate[] coordinateArray =  new Coordinate[] {c};        
        CoordinateSequence coordinateSequence = new CoordinateArraySequence(coordinateArray);        
        Point point = new Point(coordinateSequence, geometryTransformer.getGeometryFactory());        
        return point;
    }

}
