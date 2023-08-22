package org.opengis.cite.wcs20.exception;

import org.testng.SkipException;

/**
 * @author <a href="mailto:goltz@lat-lon.de">Lyn Goltz </a>
 */
public class UnknownCrsException extends SkipException {

    public UnknownCrsException( String skipMessage ) {
        super( skipMessage );
    }

}
