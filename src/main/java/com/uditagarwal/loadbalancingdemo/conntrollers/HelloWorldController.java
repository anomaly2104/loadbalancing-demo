package com.uditagarwal.loadbalancingdemo.conntrollers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

  @RequestMapping("/hello")
  public String hello() throws InterruptedException {
    logger.info("Hello api called");
    Thread.sleep(50);
    return "Hello World!";
  }
}
