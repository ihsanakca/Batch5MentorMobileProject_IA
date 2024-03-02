package com.krafttech.utils;

public enum Device {

    Pixel_3("emulator-5554",
            "11",
            "Pixel_3",
            "Android"),
    Redmi_8("3c7eb8",
            "12",
            "xiaomiNote8",
            "Android");

    public String  udid;
    public String  version;
    public String  deviceName;
    public String  platformName;

    Device(String udid, String version, String deviceName, String platformName) {
        this.udid = udid;
        this.version = version;
        this.deviceName = deviceName;
        this.platformName = platformName;
    }
}
