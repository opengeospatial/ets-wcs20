# WCS 2.0 Test Suite Release Notes

## 1.20 (2023-08-29)

   - [#120](https://github.com/opengeospatial/ets-wcs20/issues/120) - WCS 2.0.1 test on earth observation application profile has problem in Test wcseo:req6
   - [#37](https://github.com/opengeospatial/ets-wcs20/issues/37) - WCS 2.0.1 - Inconsistence between WCS Core and WCS Scaling Extension requirement
   - [#121](https://github.com/opengeospatial/ets-wcs20/issues/121) - WCS 2.0.1 test on earth observation application profile has problem in Test wcseo:req38
   - [#97](https://github.com/opengeospatial/ets-wcs20/issues/97) - Test wcs2:get-kvp-crs-req6 first listed crsSupported incompatible with coverage
   - [#124](https://github.com/opengeospatial/ets-wcs20/issues/124) - wcs 2.0.1 te2 Test wcs2:req41 has problem

## 1.19 (2023-05-31)

   - [#111](https://github.com/opengeospatial/ets-wcs20/issues/111) - My WCS 2.0.1 service fails at the very beginning when run against compliance test
   - [#118](https://github.com/opengeospatial/ets-wcs20/pull/118) - Upgrade TEAM Engine dependencies to v5.6.1

## 1.18 (2022-11-29)

   - [#113](https://github.com/opengeospatial/ets-wcs20/issues/113) - Test get-kvp-core-req41 is failing on Beta environment
   - [#115](https://github.com/opengeospatial/ets-wcs20/pull/115) - Update url to license and integration into reporting and replace ogc logo
   - [#116](https://github.com/opengeospatial/ets-wcs20/pull/116) - Fix SoapUI integration tests
   - [#112](https://github.com/opengeospatial/ets-wcs20/pull/112) - Add credentials to SoapUI project

## 1.17 (2021-05-28)

   - [#94](https://github.com/opengeospatial/ets-wcs20/issues/94) - wcs2:get-int-req17 and wcs2:get-int-req18 have wrong content in interpolationMethod parameter
   - [#55](https://github.com/opengeospatial/ets-wcs20/issues/55) - wcs2:post-xml-req5 fails with InvocationTargetException (post/xml)
   - [#100](https://github.com/opengeospatial/ets-wcs20/issues/100) - Add template to get an XML/JSON response via rest endpoint
   - [#106](https://github.com/opengeospatial/ets-wcs20/pull/106) - Set Docker TEAM Engine version to 5.4.1
   - [#99](https://github.com/opengeospatial/ets-wcs20/pull/99) - Bump junit from 4.12 to 4.13.1
   - [#104](https://github.com/opengeospatial/ets-wcs20/pull/104) - Added header for soapui test.
   - [#103](https://github.com/opengeospatial/ets-wcs20/pull/103) - Update ext_get-int.xml

## 1.16 (2020-07-01)

   - [#33](https://github.com/opengeospatial/ets-wcs20/issues/33) - Test wcs2:main_test makes invalid GetCapabilities request
   - [#71](https://github.com/opengeospatial/ets-wcs20/issues/71) - Create SoapUI tests and integrate them into Maven and Jenkinsfile
   - [#88](https://github.com/opengeospatial/ets-wcs20/issues/88) - problems in checking gml support
   - [#32](https://github.com/opengeospatial/ets-wcs20/issues/32) - query parameters in service endpoint are ignored
   - [#93](https://github.com/opengeospatial/ets-wcs20/issues/93) - several test of interpolatin extension does not appears in test result
   - [#78](https://github.com/opengeospatial/ets-wcs20/issues/78) - Test wcseo:req6 does not accept gml:EnvelopeWithTimePeriod

## 1.15 (2019-07-30)

   - [#77](https://github.com/opengeospatial/ets-wcs20/issues/77) - wcs2:req21 & wcs2:req22 are failed with validation error if it has the \<nilValues\> element
   - [#35](https://github.com/opengeospatial/ets-wcs20/issues/35) - EO WCS Test takes too long to execute
   - [#85](https://github.com/opengeospatial/ets-wcs20/issues/85) - Update to TEAM Engine 5.4 API
   - [#23](https://github.com/opengeospatial/ets-wcs20/issues/23) - CRS_Extension srsName attribute is not valid WCS.2.0.1 schema
   - [#38](https://github.com/opengeospatial/ets-wcs20/issues/38) - The req21 and req22 are failed with the OSGeo(MapServer) Server
   - [#75](https://github.com/opengeospatial/ets-wcs20/issues/75) - Enable Docker support
   - [#72](https://github.com/opengeospatial/ets-wcs20/issues/72) - Enable test execution using a RESTful API

## 1.14 (2018-05-16)

   - [#42](https://github.com/opengeospatial/ets-wcs20/issues/42) - Update CTL with better information about conformance classes

## 1.13.1 (2018-03-01)

   - [#64](https://github.com/opengeospatial/ets-wcs20/issues/64) - DescribeCoverage test fails with validation failure

## 1.13 (2018-02-28)

   - [#56](https://github.com/opengeospatial/ets-wcs20/issues/56) - wcseo:get-kvp-req63-66 fails with InvocationTargetException (eowcs)
   - [#57](https://github.com/opengeospatial/ets-wcs20/issues/57) - wcseo:get-kvp-req50 fails with InvocationTargetException (eowcs)
   - [#43](https://github.com/opengeospatial/ets-wcs20/issues/43) - Scale extension is wrong for scaleByFactor in test script
   - [#45](https://github.com/opengeospatial/ets-wcs20/issues/45) - escape special char from get parameters
   - [#58](https://github.com/opengeospatial/ets-wcs20/issues/58) - wcseo:get-kvp-req63-66 because of missing attribute number-Returned attribute
   - [#62](https://github.com/opengeospatial/ets-wcs20/issues/62) - Clean up extension 'Interpolation'
   - [#60](https://github.com/opengeospatial/ets-wcs20/issues/60) - Test of extension Interpolation fails with NPE
   - [#49](https://github.com/opengeospatial/ets-wcs20/issues/49) - Validate the service endpoint URL before running test
   - [#24](https://github.com/opengeospatial/ets-wcs20/issues/24) - CRS Extension Req18 error in TeamEngine with SOAP version 1.2
   - [#22](https://github.com/opengeospatial/ets-wcs20/issues/22) - [Critical]ext_crs wrong input parameters (Capabilities,SupportsGML) from calling in wcs2main.xml
   - [#48](https://github.com/opengeospatial/ets-wcs20/pull/48) - Fix execution of extension 'Interpolation' (wrong use of choose-when)
   - [#46](https://github.com/opengeospatial/ets-wcs20/pull/46) - Integrated local GML 3.2 schema dependencies

## 1.12 (2017-03-09)
 
   - [#36](https://github.com/opengeospatial/ets-wcs20/issues/36) - Updated the test name req63-66. #34 
   - [#34](https://github.com/opengeospatial/ets-wcs20/issues/34) - Test wise:DescribeEOCoverageSet Failed req 63build_release.sh
   -  [#31](https://github.com/opengeospatial/ets-wcs20/issues/31) - Update eowcs_DescribeCoverage.xml

## 1.11 (2016-11-30)

  - [#29](https://github.com/opengeospatial/ets-wcs20/issues/29) - WCS test can only run the first chosen Test subset of test suite
  -  [#25](https://github.com/opengeospatial/ets-wcs20/issues/25) - Update user form to match correct names for conformance classes
  -  [#26](https://github.com/opengeospatial/ets-wcs20/issues/26) - Error in calling extensions in WCS2 .0.1 (EOWCS) with Null Exception
  -  [#19](https://github.com/opengeospatial/ets-wcs20/issues/19) - req:12 failed due to multiple serviceTypeVersion parameter in response
  -  [#29](https://github.com/opengeospatial/ets-wcs20/issues/29) - WCS test can only run the first chosen test subset of test suite
  - [#27](https://github.com/opengeospatial/ets-wcs20/issues/27) - Fixed eowcs Namespace issue
  - [#40](https://github.com/opengeospatial/ets-wcs20/issues/40) - Error in calling extensions in WCS2 .0.1 (EOWCS) with Null Exception
  
## 1.10 (2016-09-09)

  - [#15](https://github.com/opengeospatial/ets-wcs20/issues/15) -  Req37 kvp test on coverage id


## 1.9 (2016-01-28)

  - [#10](https://github.com/opengeospatial/ets-wcs20/issues/10) - Test wcs2:get-kvp-core-req42 in GetCoverage.xml always fail
  - [#9](https://github.com/opengeospatial/ets-wcs20/issues/9) - Wrong version of OWS in WCS GetCapabilities request
  - [#8](https://github.com/opengeospatial/ets-wcs20/issues/8) - URL encoding of '+' character in GetCoverage request
  - [#12](https://github.com/opengeospatial/ets-wcs20/issues/12) - Fixed version metadata in GetCapabilities Post requests
  - [#7](https://github.com/opengeospatial/ets-wcs20/issues/7) - PNG not being parsing with ImageParser - Test wcs2:get-proc-req8-10


## 1.8 (2015-08-19)

  - [#11](https://github.com/opengeospatial/ets-wcs20/issues/11) - Merge core, post, processing, scaling, interpolation, range subsetting, crs extensions and eowcs profile

## 1.7 (2015-03-05)

- Update to new scheme versioning

## r6 (2014-11-30)

- [#5](https://github.com/opengeospatial/ets-wcs20/issues/5) - Test failure - java.lang.reflect.InvocationTargetException
- Edited and adjusted documentation (index.html)
- Migrate source code to [GitHub](https://github.com/opengeospatial/ets-wcs20)
- Adopt Apache Maven as the build tool

## r5 (2013-10-29) 

- Fixed issue #853 when supporting multiple formats
- Fixed references to standard documents (#880)

## r4 (2013-08-09)

- Fixed issue #770
- Fixed issue #743
- Corrected check for operations
- Corrected checking or GML support
- Fixed issue #849
- Fixed issue #755 - Adjusted schema location and version
- Corrected KVP encoding
- Fixed issue #850
- Adjusted requirements  
- Adjusted exception test to use wrong subsetting values.
- Added http response code 404 testing
- Fixed test on invalid subsetting according to req41 and etc.
- Updated documentation (lb)

## r3 (2013-07-17)

- Edited documentation (index.html)

## r2 (2012-02-014)

- fixed req1-9 on the duplicated url
- fixed req12 for post request of Capabilities
- fixed req23 for xpath of concate()

## r1 (2012-02-08)
- Added http code checking according to OWS common

## r0 (2012-11-15)
- Add/update test suites according to OGC-09-110r4 and OGC-09-147r3
