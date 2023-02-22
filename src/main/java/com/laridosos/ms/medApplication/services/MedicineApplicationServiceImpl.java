package com.laridosos.ms.medApplication.services;

import java.util.List;
import com.laridosos.ms.medApplication.models.MedicineApplication;
import com.laridosos.ms.medApplication.repositories.MedicineApplicationRepository;
import org.springframework.stereotype.Service;

@Service
public class MedicineApplicationServiceImpl implements MedicineApplicationService {

  private final MedicineApplicationRepository repository;

  public MedicineApplicationServiceImpl(MedicineApplicationRepository repository) {
    this.repository = repository;
  }

  @Override
  public void saveAll(List<MedicineApplication> medApplications) {
    repository.deleteAll();
    repository.saveAll(medApplications);
  }
}
