package org.blackdread.cameraframework.api.constant;

import org.blackdread.camerabinding.jna.EdsdkLibrary;
import org.blackdread.cameraframework.util.LibraryFieldUtil;

/**
 * <p>Created on 2018/10/04.<p>
 *
 * @author Yoann CAPLAIN
 * @since 1.0.0
 */
public enum EdsConstant implements NativeEnum<Integer> {
    EDS_MAX_NAME("Maximum File Name Length"),
    EDS_TRANSFER_BLOCK_SIZE("Transfer Block Size");

    private final int value;
    private final String description;

    EdsConstant(final String description) {
        value = LibraryFieldUtil.getNativeIntValue(EdsdkLibrary.class, name());
        this.description = description;
    }

    @Override
    public final Integer value() {
        return value;
    }

    @Override
    public final String description() {
        return description;
    }

    /**
     * @param value value to search
     * @return enum having same value as passed
     * @throws IllegalArgumentException if value was not found
     */
    public static EdsConstant ofValue(final Integer value) {
        return ConstantUtil.ofValue(EdsConstant.class, value);
    }
}
