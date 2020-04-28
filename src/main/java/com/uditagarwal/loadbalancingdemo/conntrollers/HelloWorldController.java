package com.uditagarwal.loadbalancingdemo.conntrollers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping("/hello")
  public String hello() throws InterruptedException {
    System.out.println("Hello api " + Math.random());
    Thread.sleep(50);
    return "Hello World!";
  }
}
