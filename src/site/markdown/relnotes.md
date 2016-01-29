# WCS 2.0 Test Suite Release Notes

## 1.10 (2016-01-28)

  - [#10](https://github.com/opengeospatial/ets-wcs20/issues/10) - Test wcs2:get-kvp-core-req42 in GetCoverage.xml always fail
  - [#9](https://github.com/opengeospatial/ets-wcs20/issues/9) - Wrong version of OWS in WCS GetCapabilities request
  - [#8](https://github.com/opengeospatial/ets-wcs20/issues/8) - URL encoding of '+' character in GetCoverage request


## 1.9 (2015-12-08)

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
