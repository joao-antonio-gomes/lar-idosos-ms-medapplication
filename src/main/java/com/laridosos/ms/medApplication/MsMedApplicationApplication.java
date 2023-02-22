package com.laridosos.ms.medApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsMedApplicationApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsMedApplicationApplication.class, args);
  }

}
