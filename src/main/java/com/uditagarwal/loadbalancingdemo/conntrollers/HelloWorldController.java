package com.uditagarwal.loadbalancingdemo.conntrollers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

  @Value( "${server.port}" )
  private String serverPort;

  @RequestMapping("/hello")
  public String hello() throws InterruptedException {
    logger.info("Hello api called at server with port: " + serverPort);
    Thread.sleep(50);
    return "Hello World from " + serverPort + "!";
  }
}
