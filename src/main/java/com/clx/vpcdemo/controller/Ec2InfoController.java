package com.clx.vpcdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clx.vpcdemo.dto.Ec2InfoDTO;

@RestController
public class Ec2InfoController {

  @GetMapping("/ec2-info")
  public Ec2InfoDTO getEc2Info() {
    Ec2InfoDTO ec2Info = new Ec2InfoDTO();
    ec2Info.setRegionName("Warsaw");
    ec2Info.setAvailabilityZone("Mokotow");
    return ec2Info;
  }
}
