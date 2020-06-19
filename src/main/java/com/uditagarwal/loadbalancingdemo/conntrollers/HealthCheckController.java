package com.uditagarwal.loadbalancingdemo.conntrollers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    Logger logger = LoggerFactory.getLogger(HealthCheckController.class);

    @Value( "${server.port}" )
    private String serverPort;

    @RequestMapping("/health")
    public String health() {
      logger.info("Health check received at" + serverPort);
      return "All good from " + serverPort;
    }
}
