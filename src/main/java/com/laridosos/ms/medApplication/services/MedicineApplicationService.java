package com.laridosos.ms.medApplication.services;

import java.util.List;
import com.laridosos.ms.medApplication.models.MedicineApplication;

public interface MedicineApplicationService {
  void saveAll(List<MedicineApplication> medApplications);
}
