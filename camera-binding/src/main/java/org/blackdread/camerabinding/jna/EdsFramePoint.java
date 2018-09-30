package org.blackdread.camerabinding.jna;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : sdk-header\EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsFramePoint extends Structure {
	/** C type : EdsInt32 */
	public NativeLong x;
	/** C type : EdsInt32 */
	public NativeLong y;
	public EdsFramePoint() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("x", "y");
	}
	/**
	 * @param x C type : EdsInt32<br>
	 * @param y C type : EdsInt32
	 */
	public EdsFramePoint(NativeLong x, NativeLong y) {
		super();
		this.x = x;
		this.y = y;
	}
	public EdsFramePoint(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsFramePoint implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsFramePoint implements Structure.ByValue {
		
	};
}
