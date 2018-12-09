package org.blackdread.cameraframework.api.command;

import org.blackdread.camerabinding.jna.EdsdkLibrary;
import org.blackdread.cameraframework.api.constant.EdsPropertyID;

import static org.blackdread.cameraframework.api.helper.factory.CanonFactory.propertyGetShortcutLogic;

/**
 * Gets a property from the camera.
 * <br>
 * The function EdsSetPropertyData is used to set properties.
 * <br>
 * This API takes objects of undefined type as arguments, the properties that can be retrieved or set
 * differ depending on the given object. In addition, some properties have a list of currently settable values.
 * EdsGetPropertyDesc is used to get this list of settable values.
 * <p>Created on 2018/10/02.<p>
 *
 * @author Yoann CAPLAIN
 * @since 1.0.0
 */
public abstract class GetPropertyCommand<R> extends AbstractCanonCommand<R> {

    public GetPropertyCommand() {
    }

    public GetPropertyCommand(final GetPropertyCommand<R> toCopy) {
        super(toCopy);
    }

    @Override
    protected R runInternal() {
        // TODO generify get values so less duplicate code in runInternal() for get commands
        System.out.println("impl 1");
        return null;
    }

    /**
     * A string representing the product name.
     * <br>
     * If the target object is EdsCameraRef, this property indicates the name of the remote camera.
     * <br>
     * If the target object is EdsImageRef, this property indicates the name of the camera used to shoot the image.
     * <br>
     * ASCII text strings up to 32 characters, including null-terminated strings.
     */
    public static class ProductName extends GetPropertyCommand<String> {

        public ProductName() {
            final EdsPropertyID kEdsPropID_productName = EdsPropertyID.kEdsPropID_ProductName;
        }

        public ProductName(final ProductName toCopy) {
            super(toCopy);
        }

        @Override
        protected String runInternal() {
            switch (getTargetRefType()) {
                case CAMERA:
                    return propertyGetShortcutLogic().getProductName((EdsdkLibrary.EdsCameraRef) getTargetRefInternal());
                case IMAGE:
                    return propertyGetShortcutLogic().getProductName((EdsdkLibrary.EdsImageRef) getTargetRefInternal());
                default:
                    throw new IllegalStateException("Unsupported type");
            }
        }
    }

}
