package org.blackdread.cameraframework.exception.error.picture;

import org.blackdread.cameraframework.api.constant.EdsdkError;

/**
 * <p>Created on 2018/12/13.</p>
 *
 * @author Yoann CAPLAIN
 * @since 1.0.0
 */
public class EdsdkPictureStroboChargeErrorException extends EdsdkTakePictureErrorException {

    private static final long serialVersionUID = 1L;

    public EdsdkPictureStroboChargeErrorException() {
        super(EdsdkError.EDS_ERR_TAKE_PICTURE_STROBO_CHARGE_NG.description(), EdsdkError.EDS_ERR_TAKE_PICTURE_STROBO_CHARGE_NG);
    }

    public EdsdkPictureStroboChargeErrorException(final String message) {
        super(message, EdsdkError.EDS_ERR_TAKE_PICTURE_STROBO_CHARGE_NG);
    }

}
