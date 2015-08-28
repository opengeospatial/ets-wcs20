# WCS 2.0 compliance test suite

## Scope

This Executable Test Suite (ETS) verifies the conformance of **WCS 2.0** services. The services should be accessed through WCS GetCapabilities and DescribeCoverage using the HTTP KVP, POST, and/or SOAP protocol bindings, and GetCoverage using the HTTP KVP binding. The GetCoverage response should be provided as a GML coveage instance document.

## Test coverage

In this test suite all mandatory conformance requirements are checked, and every instance document is thoroughly validated against all referenced XML schemas. Table 1 below provides the names of the conformance classes, references to the relevant clause in the abstract test suite (ATS) in Annex A, and information about its implementation status.

<table style="border-collapse: collapse;" border="1"><caption>Table 1 - Conformance class coverage</caption>

<thead>

<tr>

<th>Conformance class</th>

<th>ATS reference</th>

<th>Availability</th>

</tr>

</thead>

<tbody>

<tr>

<td>Core</td>

<td>OGC 09-110r4 A.1</td>

<td>Yes</td>

</tr>

<tr>

<td>Post</td>

<td>OGC 09-148r1 A.1</td>

<td>Yes</td>

</tr>

<tr>

<td>Processing</td>

<td>OGC 08-059r4 A.1</td>

<td>Yes</td>

</tr>

<tr>

<td>Scaling</td>

<td>OGC 12-039 A.1</td>

<td>Yes</td>

</tr>

<tr>

<td>Interpolation</td>

<td>OGC 12-049 A.1</td>

<td>Yes</td>

</tr>

<tr>

<td>Record subsetting</td>

<td>OGC 12-040 A.1</td>

<td>Yes</td>

</tr>

<tr>

<td>CRS</td>

<td>OGC 11-053 A.1-A.3</td>

<td>Yes</td>

</tr>

<tr>

<td>EOWCS</td>

<td>OGC 10-140 A.1-A.3</td>

<td>Yes</td>

</tr>

<tr>

<td colspan="3" style="padding: 0.5em;">**Note:** Done by TEAMEngine when a kvp request is invoked (A.2)</td>

</tr>

</tbody>

</table>

## Test requirements

The documents listed below stipulate requirements that must be satisfied by a conforming application schema.

*   [OWS Common] [OGC Web Services Common Standard](https://portal.opengeospatial.org/files/?artifact_id=38867) (OGC 06-121r9)
*   [WCS Core] [OGC® WCS 2.0 Interface Standard - Core](https://portal.opengeospatial.org/files/?artifact_id=41437) (OGC 09-110r3)
*   [WCS Core Corrigendum] [OGC® WCS 2.0 Interface Standard - Core: Corrigendum](https://portal.opengeospatial.org/files/?artifact_id=48428) (09-110r4)
*   [GMLCOV] [OGC® GML Application Schema - Coverages](https://portal.opengeospatial.org/files/?artifact_id=48553) (09-146r2)
*   [WCS KVP] [OGC® Web Coverage Service 2.0 Interface Standard - KVP Protocol Binding Extension - Corrigendum](https://portal.opengeospatial.org/files/?artifact_id=50140) (OGC 09-147r3)
*   [WCS POST] [OGC® Web Coverage Service 2.0 Interface Standard - XML/POST Protocol Binding Extension](https://portal.opengeospatial.org/files/?artifact_id=41440) (OGC 09-148r1)
*   [WCS SOAP] [OGC® Web Coverage Service 2.0 Interface Standard - XML/SOAP Protocol Binding Extension](https://portal.opengeospatial.org/files/?artifact_id=41441) (OGC 09-149r1)
*   [WCS Processing] [OGC® Web Coverage Service Interface Standard - Processing Extension](https://portal.opengeospatial.org/files/?artifact_id=51868) (OGC 08-059r4)
*   [WCS Scaling] [OGC® Web Coverage Service Interface Standard - Scaling Extension](https://portal.opengeospatial.org/files/12-039) (OGC 12-039)
*   [WCS Interpolation] [OGC® Web Coverage Service Interface Standard - Interpolation Extension](https://portal.opengeospatial.org/files/12-049) (OGC 12-049)
*   [WCS Range Subsetting] [OGC® Web Coverage Service Interface Standard - Range Subsetting Extension](https://portal.opengeospatial.org/files/12-040) (OGC 12-040)
*   [WCS CRS] [OGC® Web Coverage Service Interface Standard - CRS Extension](https://portal.opengeospatial.org/files/11-053) (OGC 11-053)
*   [WCS EOWCS] [OGC® Web Coverage Service Interface Standard - Earth Observation Application Profile](https://portal.opengeospatial.org/files/42722) (OGC 10-140r1)
*   Compliance Test Language (CTL) 0.5

General requirements for the implementation:

1.  At least one protocol implementation should be available and advertised in the GetCapabilities response.
2.  The implementation provides at least two coverages.
3.  The first coverage offering should be a RectifiedGridCoverage with at least 2 dimensions, while the second coverage can be any coverage.
4.  Do not use CoverageId_Bogus as a coverage ID, format_bogus as a format name, mediatype_bogus for the mediatype parameter, or dimension_bogus as an axis name.
5.  The offered coverage must be implemented according to the GMLCov specification (09-146r2).

## How to run the tests

The test suite may be run in any of the following environments:

*   TEAM-Engine: Run the CTL script located in the `/src/main/ctl/` directory.

## Test data

Sample coverages can be found at [http://schemas.opengis.net/wcs/2.0/examples](http://schemas.opengis.net/wcs/2.0/examples).

## Schemas

The schemas for ows can be found at [http://schemas.opengis.net/ows/2.0](http://schemas.opengis.net/ows/2.0).

The schemas for wcs can be found at [http://schemas.opengis.net/wcs/2.0](http://schemas.opengis.net/wcs/2.0).