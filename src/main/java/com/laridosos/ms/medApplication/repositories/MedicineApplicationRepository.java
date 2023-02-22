package com.laridosos.ms.medApplication.repositories;

import java.util.UUID;
import com.laridosos.ms.medApplication.models.MedicineApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineApplicationRepository extends JpaRepository<MedicineApplication, UUID> {
}
