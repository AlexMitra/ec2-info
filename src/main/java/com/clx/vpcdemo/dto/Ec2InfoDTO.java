package com.clx.vpcdemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ec2-info")
public class Ec2InfoDTO {

    @JsonProperty("region_name")
    private String regionName;

    @JsonProperty("availability_zone")
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
