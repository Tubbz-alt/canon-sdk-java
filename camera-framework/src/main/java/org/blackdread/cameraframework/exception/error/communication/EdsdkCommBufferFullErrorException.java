package org.blackdread.cameraframework.exception.error.communication;

import org.blackdread.cameraframework.api.constant.EdsdkError;

/**
 * <p>Created on 2018/12/13.</p>
 *
 * @author Yoann CAPLAIN
 * @since 1.0.0
 */
public class EdsdkCommBufferFullErrorException extends EdsdkCommunicationErrorException {

    private static final long serialVersionUID = 1L;

    public EdsdkCommBufferFullErrorException() {
        super(EdsdkError.EDS_ERR_COMM_BUFFER_FULL.description(), EdsdkError.EDS_ERR_COMM_BUFFER_FULL);
    }

    public EdsdkCommBufferFullErrorException(final String message) {
        super(message, EdsdkError.EDS_ERR_COMM_BUFFER_FULL);
    }

}
