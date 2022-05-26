package com.clx.vpcdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.util.EC2MetadataUtils;
import com.clx.vpcdemo.dto.Ec2InfoDTO;

@RestController
public class Ec2InfoController {

  Logger logger = LoggerFactory.getLogger(Ec2InfoController.class);

  @GetMapping("/ec2-info")
  public Ec2InfoDTO getEc2Info() {
    Ec2InfoDTO ec2Info = new Ec2InfoDTO();
    try {
      EC2MetadataUtils.InstanceInfo info = EC2MetadataUtils.getInstanceInfo();
      ec2Info.setRegionName(info.getRegion());
      ec2Info.setAvailabilityZone(info.getAvailabilityZone());
    } catch (Exception exception) {
      logger.error("Error while updating EC2 metadata: " + exception.getMessage());
    }
    return ec2Info;
  }
}
