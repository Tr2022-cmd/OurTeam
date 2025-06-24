package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.Patient_info;

import java.util.List;

public interface PatientService extends IService<Patient_info> {

    List<Patient_info> queryPatients(Integer healthcardId, String identificationId, String name);
    boolean updateByHealthcardId(Integer healthcardId, Patient_info patientInfo);
}
