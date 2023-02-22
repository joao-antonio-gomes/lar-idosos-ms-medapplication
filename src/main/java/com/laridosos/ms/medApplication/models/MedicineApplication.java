package com.laridosos.ms.medApplication.models;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "medicine_application")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MedicineApplication {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  private LocalDate date;
  private LocalTime hour;
  @Column(name = "is_applied")
  private boolean applied;

  @Column(name = "treatment_medicine_id")
  private Long treatmentMedicineId;
}
