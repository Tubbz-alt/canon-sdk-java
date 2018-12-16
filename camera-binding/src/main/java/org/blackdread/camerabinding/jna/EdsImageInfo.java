/*
 * MIT License
 *
 * Copyright (c) 2018 Yoann CAPLAIN
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
public class EdsImageInfo extends Structure {
	/** C type : EdsUInt32 */
	public NativeLong width;
	/** C type : EdsUInt32 */
	public NativeLong height;
	/** C type : EdsUInt32 */
	public NativeLong numOfComponents;
	/** C type : EdsUInt32 */
	public NativeLong componentDepth;
	/** C type : EdsRect */
	public EdsRect effectiveRect;
	/** C type : EdsUInt32 */
	public NativeLong reserved1;
	/** C type : EdsUInt32 */
	public NativeLong reserved2;
	public EdsImageInfo() {
		super();
	}
    @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("width", "height", "numOfComponents", "componentDepth", "effectiveRect", "reserved1", "reserved2");
	}
	/**
	 * @param width C type : EdsUInt32<br>
	 * @param height C type : EdsUInt32<br>
	 * @param numOfComponents C type : EdsUInt32<br>
	 * @param componentDepth C type : EdsUInt32<br>
	 * @param effectiveRect C type : EdsRect<br>
	 * @param reserved1 C type : EdsUInt32<br>
	 * @param reserved2 C type : EdsUInt32
	 */
	public EdsImageInfo(NativeLong width, NativeLong height, NativeLong numOfComponents, NativeLong componentDepth, EdsRect effectiveRect, NativeLong reserved1, NativeLong reserved2) {
		super();
		this.width = width;
		this.height = height;
		this.numOfComponents = numOfComponents;
		this.componentDepth = componentDepth;
		this.effectiveRect = effectiveRect;
		this.reserved1 = reserved1;
		this.reserved2 = reserved2;
	}
	public EdsImageInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsImageInfo implements Structure.ByReference {
		
	}
	public static class ByValue extends EdsImageInfo implements Structure.ByValue {
		
	}
}
