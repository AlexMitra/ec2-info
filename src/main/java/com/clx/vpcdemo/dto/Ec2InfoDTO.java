package com.clx.vpcdemo.dto;

public class Ec2InfoDTO {
    private String regionName;
    private String availabilityZone;

    public String getRegionName() {
        return regionName;
    }

    public Ec2InfoDTO setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public Ec2InfoDTO setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
}
