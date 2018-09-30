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
public class EdsTime extends Structure {
	/** C type : EdsUInt32 */
	public NativeLong year;
	/** C type : EdsUInt32 */
	public NativeLong month;
	/** C type : EdsUInt32 */
	public NativeLong day;
	/** C type : EdsUInt32 */
	public NativeLong hour;
	/** C type : EdsUInt32 */
	public NativeLong minute;
	/** C type : EdsUInt32 */
	public NativeLong second;
	/** C type : EdsUInt32 */
	public NativeLong milliseconds;
	public EdsTime() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("year", "month", "day", "hour", "minute", "second", "milliseconds");
	}
	/**
	 * @param year C type : EdsUInt32<br>
	 * @param month C type : EdsUInt32<br>
	 * @param day C type : EdsUInt32<br>
	 * @param hour C type : EdsUInt32<br>
	 * @param minute C type : EdsUInt32<br>
	 * @param second C type : EdsUInt32<br>
	 * @param milliseconds C type : EdsUInt32
	 */
	public EdsTime(NativeLong year, NativeLong month, NativeLong day, NativeLong hour, NativeLong minute, NativeLong second, NativeLong milliseconds) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.milliseconds = milliseconds;
	}
	public EdsTime(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsTime implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsTime implements Structure.ByValue {
		
	};
}
