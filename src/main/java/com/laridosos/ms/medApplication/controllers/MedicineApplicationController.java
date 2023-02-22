package com.laridosos.ms.medApplication.controllers;

import com.laridosos.ms.medApplication.services.MedicineApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicine-application")
public class MedicineApplicationController {

  @Autowired
  private MedicineApplicationService service;

}
