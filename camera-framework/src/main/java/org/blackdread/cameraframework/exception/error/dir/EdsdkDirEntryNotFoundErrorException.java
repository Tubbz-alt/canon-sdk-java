package org.blackdread.cameraframework.exception.error.dir;

import org.blackdread.cameraframework.api.constant.EdsdkError;

/**
 * <p>Created on 2018/12/13.</p>
 *
 * @author Yoann CAPLAIN
 * @since 1.0.0
 */
public class EdsdkDirEntryNotFoundErrorException extends EdsdkDirectoryErrorException {

    private static final long serialVersionUID = 1L;

    public EdsdkDirEntryNotFoundErrorException() {
        super(EdsdkError.EDS_ERR_DIR_ENTRY_NOT_FOUND.description(), EdsdkError.EDS_ERR_DIR_ENTRY_NOT_FOUND);
    }

    public EdsdkDirEntryNotFoundErrorException(final String message) {
        super(message, EdsdkError.EDS_ERR_DIR_ENTRY_NOT_FOUND);
    }

}
