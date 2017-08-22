package com.pet.sample.ms_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MSApplication {
  public static void main(String[] args) {
    SpringApplication.run(MSApplication.class, args);
  }
}
