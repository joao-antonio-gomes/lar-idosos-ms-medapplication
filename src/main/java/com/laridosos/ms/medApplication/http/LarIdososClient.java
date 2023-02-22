package com.laridosos.ms.medApplication.http;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import java.util.List;
import com.laridosos.ms.medApplication.dtos.MedicineApplicationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "api-laridosos")
public interface LarIdososClient {

  @RequestMapping(method = GET, value = "/api/medicine-applications")
  List<MedicineApplicationDTO> getMedicineApplications();
}
