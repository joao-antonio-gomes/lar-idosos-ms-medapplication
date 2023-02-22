package com.laridosos.ms.medApplication.schedule.statusReceiver;

import java.util.List;
import com.laridosos.ms.medApplication.dtos.MedicineApplicationDTO;
import com.laridosos.ms.medApplication.http.LarIdososClient;
import com.laridosos.ms.medApplication.models.MedicineApplication;
import com.laridosos.ms.medApplication.services.MedicineApplicationService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class MedicineApplicationStatusReceiver {

  private final long SEGUNDO = 1000;
  private final long MINUTO = SEGUNDO * 60;
  private final long HORA = MINUTO * 60;

  private final LarIdososClient larIdososClient;
  private final MedicineApplicationService service;

    public MedicineApplicationStatusReceiver(LarIdososClient larIdososClient,
        MedicineApplicationService service) {
        this.larIdososClient = larIdososClient;
        this.service = service;
    }

    @Scheduled(fixedRate = MINUTO)
  public void sendAllMedicineApplications() {
    List<MedicineApplicationDTO> medApplicationsDTO = larIdososClient.getMedicineApplications();
    List<MedicineApplication> medApplications = medApplicationsDTO.stream()
                                                                  .map(med -> MedicineApplication.builder()
                                                                                                 .id(med.getId())
                                                                                                 .date(med.getDate())
                                                                                                 .hour(med.getHour())
                                                                                                 .applied(
                                                                                                     med.isApplied())
                                                                                                 .treatmentMedicineId(
                                                                                                     med.getTreatmentId())
                                                                                                 .build())
                                                                  .toList();
    service.saveAll(medApplications);
  }
}
