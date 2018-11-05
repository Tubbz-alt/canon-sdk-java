package org.blackdread.cameraframework.api.helper.factory;

import org.blackdread.camerabinding.jna.EdsdkLibrary;
import org.blackdread.cameraframework.api.CanonLibrary;
import org.blackdread.cameraframework.api.command.SingleCommandDispatcher;
import org.blackdread.cameraframework.api.helper.logic.CameraLogic;
import org.blackdread.cameraframework.api.helper.logic.CommandDispatcher;
import org.blackdread.cameraframework.api.helper.logic.LiveViewLogic;
import org.blackdread.cameraframework.api.helper.logic.PropertyDescLogic;
import org.blackdread.cameraframework.api.helper.logic.PropertyGetLogic;
import org.blackdread.cameraframework.api.helper.logic.PropertyLogic;
import org.blackdread.cameraframework.api.helper.logic.PropertySetLogic;
import org.blackdread.cameraframework.api.helper.logic.ShootLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.concurrent.NotThreadSafe;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Created on 2018/10/09.<p>
 *
 * @author Yoann CAPLAIN
 */
@NotThreadSafe
public class CanonFactory {

    private static final Logger log = LoggerFactory.getLogger(CanonFactory.class);

    private static final AtomicInteger factoryChangedCount = new AtomicInteger(0);

    /**
     * Mutable to allow user to define its own factory and overrides logic.
     * If different factory is desired, it should be set as soon as possible in the main class then never changed again (can but not desirable and not volatile)
     */
    private static CanonFactory canonFactory = new CanonFactory();

    // TODO this is not lazy...
    private static final CommandDispatcher commandDispatcher = SingleCommandDispatcher.getInstance();

    // TODO if factory is changed, we should give protected method to let user modify or set to null those variables
    private static final CanonLibrary canonLibrary = new CanonLibraryImpl();

    private static final CameraLogic cameraLogic = new CameraLogicDefault();

    private static final PropertyLogic propertyLogic = new PropertyLogicDefault();

    private static final PropertyDescLogic propertyDescLogic = new PropertyDescLogicDefault();

    private static final PropertyGetLogic propertyGetLogic = new PropertyGetLogicDefault();

    private static final PropertySetLogic propertySetLogic = new PropertySetLogicDefault();

    private static final LiveViewLogic liveViewLogic = new LiveViewLogicDefault();

    private static final ShootLogic shootLogic = new ShootLogicDefault();

    /**
     * Should never be called directly, is protected to allow to extend
     */
    protected CanonFactory() {
    }

    /**
     * @return instance of factory, never null
     */
    public static CanonFactory getCanonFactory() {
        return canonFactory;
    }

    /**
     * Allow to set a custom factory to return your own implementation of the different interfaces that this factory returns.
     * <p>It should be called as soon as possible, better first lines of main</p>
     * <p>It is not thread-safe</p>
     *
     * @param canonFactory factory to set (non null)
     */
    public static void setCanonFactory(final CanonFactory canonFactory) {
        CanonFactory.canonFactory = Objects.requireNonNull(canonFactory);
        log.info("Canon factory has been modified {} time(s)", factoryChangedCount.incrementAndGet());
    }

    /**
     * Shortcut for {@link CanonFactory#getCommandDispatcher()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getCommandDispatcher() }
     * </pre>
     *
     * @return command dispatcher instance, never null
     */
    public static CommandDispatcher commandDispatcher() {
        return CanonFactory.getCanonFactory().getCommandDispatcher();
    }


    /**
     * Shortcut for {@link CanonLibrary#edsdkLibrary()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getCanonLibrary().edsdkLibrary(); }
     * </pre>
     *
     * @return library instance, never null, throws if failed to init library
     */
    public static EdsdkLibrary edsdkLibrary() {
        return CanonFactory.getCanonFactory().getCanonLibrary().edsdkLibrary();
    }

    /**
     * Shortcut for {@link CanonFactory#getCanonLibrary()} ()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getCanonLibrary() }
     * </pre>
     *
     * @return logic instance, never null
     */
    public static CanonLibrary canonLibrary() {
        return CanonFactory.getCanonFactory().getCanonLibrary();
    }

    /**
     * Shortcut for {@link CanonFactory#getCameraLogic()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getCameraLogic() }
     * </pre>
     *
     * @return logic instance, never null
     */
    public static CameraLogic cameraLogic() {
        return CanonFactory.getCanonFactory().getCameraLogic();
    }

    /**
     * Shortcut for {@link CanonFactory#getPropertyLogic()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getPropertyLogic() }
     * </pre>
     *
     * @return logic instance, never null
     */
    public static PropertyLogic propertyLogic() {
        return CanonFactory.getCanonFactory().getPropertyLogic();
    }

    /**
     * Shortcut for {@link CanonFactory#getPropertyDescLogic()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getPropertyDescLogic() }
     * </pre>
     *
     * @return logic instance, never null
     */
    public static PropertyDescLogic propertyDescLogic() {
        return CanonFactory.getCanonFactory().getPropertyDescLogic();
    }

    /**
     * Shortcut for {@link CanonFactory#getPropertyGetLogic()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getPropertyGetLogic() }
     * </pre>
     *
     * @return logic instance, never null
     */
    public static PropertyGetLogic propertyGetLogic() {
        return CanonFactory.getCanonFactory().getPropertyGetLogic();
    }

    /**
     * Shortcut for {@link CanonFactory#getPropertySetLogic()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getPropertySetLogic() }
     * </pre>
     *
     * @return logic instance, never null
     */
    public static PropertySetLogic propertySetLogic() {
        return CanonFactory.getCanonFactory().getPropertySetLogic();
    }

    /**
     * Shortcut for {@link CanonFactory#getLiveViewLogic()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getLiveViewLogic() }
     * </pre>
     *
     * @return logic instance, never null
     */
    public static LiveViewLogic liveViewLogic() {
        return CanonFactory.getCanonFactory().getLiveViewLogic();
    }

    /**
     * Shortcut for {@link CanonFactory#getShootLogic()}
     * <pre>
     * {@code CanonFactory.getCanonFactory().getShootLogic() }
     * </pre>
     *
     * @return logic instance, never null
     */
    public static ShootLogic shootLogic() {
        return CanonFactory.getCanonFactory().getShootLogic();
    }


    /**
     * @return command dispatcher
     * @see CommandDispatcher
     */
    public CommandDispatcher getCommandDispatcher() {
        return commandDispatcher;
    }

    /**
     * @return canon library
     * @see CanonLibrary
     */
    public CanonLibrary getCanonLibrary() {
        return canonLibrary;
    }

    /**
     * @return camera logic
     * @see CameraLogic
     */
    public CameraLogic getCameraLogic() {
        return cameraLogic;
    }

    /**
     * @return property logic
     * @see PropertyLogic
     */
    public PropertyLogic getPropertyLogic() {
        return propertyLogic;
    }

    /**
     * @return property desc logic
     * @see PropertyDescLogic
     */
    public PropertyDescLogic getPropertyDescLogic() {
        return propertyDescLogic;
    }

    /**
     * @return property get logic
     * @see PropertyGetLogic
     */
    public PropertyGetLogic getPropertyGetLogic() {
        return propertyGetLogic;
    }

    /**
     * @return property set logic
     * @see PropertySetLogic
     */
    public PropertySetLogic getPropertySetLogic() {
        return propertySetLogic;
    }

    /**
     * @return live view logic
     * @see LiveViewLogic
     */
    public LiveViewLogic getLiveViewLogic() {
        return liveViewLogic;
    }

    /**
     * @return shoot logic
     * @see ShootLogic
     */
    public ShootLogic getShootLogic() {
        return shootLogic;
    }

}