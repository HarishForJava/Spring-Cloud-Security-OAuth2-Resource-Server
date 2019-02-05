package com.hfj.cloud.resource.server.rest;
/**
 * @author HFJ
 *
 */
public class MobileOs {

	private long mobileVersion;
	private String osName;

	public long getMobileVersion() {
		return mobileVersion;
	}

	public void setMobileVersion(long mobileVersion) {
		this.mobileVersion = mobileVersion;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	@Override
	public String toString() {
		return "MobileOs [mobileVersion=" + mobileVersion + ", osName=" + osName + "]";
	}

	public MobileOs(long mobileVersion, String osName) {
		super();
		this.mobileVersion = mobileVersion;
		this.osName = osName;
	}

}
