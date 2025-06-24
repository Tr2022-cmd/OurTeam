package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.PatientInfo;

import java.util.List;

public interface PatientService extends IService<PatientInfo> {

    List<PatientInfo> queryPatients(Integer healthcardId, String identificationId, String name);
    boolean updateByHealthcardId(Integer healthcardId, PatientInfo patientInfo);
}
