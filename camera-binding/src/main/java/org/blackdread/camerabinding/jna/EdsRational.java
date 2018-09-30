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
public class EdsRational extends Structure {
	/** C type : EdsInt32 */
	public NativeLong numerator;
	/** C type : EdsUInt32 */
	public NativeLong denominator;
	public EdsRational() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("numerator", "denominator");
	}
	/**
	 * @param numerator C type : EdsInt32<br>
	 * @param denominator C type : EdsUInt32
	 */
	public EdsRational(NativeLong numerator, NativeLong denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public EdsRational(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsRational implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsRational implements Structure.ByValue {
		
	};
}
