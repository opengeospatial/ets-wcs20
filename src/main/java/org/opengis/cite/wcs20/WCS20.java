package org.opengis.cite.wcs20;

public class WCS20 {

	public WCS20() {
		
	}
	
	/** Reference to the WCS capabilities document (URI). */
	public static final String URL = "url";
	
	/** The <b>WCS Core</b> is a conformance class executed by default. */
	public static final String CORE = "core";
	
	/** Run test for <b>WCS POST</b> if parameter is provided. */
	public static final String EXT_POST = "ext_post";
	
	/** Run test for <b>WCS WCPS 2.0 (Processing)</b> if parameter is provided. */
	public static final String EXT_PROCESSING = "ext_proc";
	
	/** Run test for <b>WCS Scaling 1.0</b> if parameter is provided. */
	public static final String EXT_SCALING = "ext_scal";
	
	/** Run test for <b>WCS Interpolation 1.0</b>  if parameter is provided. */
	public static final String EXT_INTERPOLATION = "ext_int";
	
	/** Run test for <b>WCS Range Subsetting 1.0</b> if parameter is provided. */
	public static final String EXT_RSUBSETTING = "ext_rsub";
	
	/** Run test for <b>WCS-CRS-extension 1.0</b> if parameter is provided. */
	public static final String EXT_CRS = "ext_crs";
	
	/** Run test for <b>WCS EO 1.0 (EOWCS)</b> if parameter is provided. */
	public static final String PROFILE_EOWCS = "profile_eowcs";
	
}
