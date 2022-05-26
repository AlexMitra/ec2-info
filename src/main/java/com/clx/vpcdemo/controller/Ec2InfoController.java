package com.clx.vpcdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ec2InfoController {

  @GetMapping("/ec2-info")
  public String getEc2Info() {
    return "Hello! Go Karma ?";
  }
}
