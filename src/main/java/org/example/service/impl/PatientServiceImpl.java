package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.PatientInfo;
import org.example.mapper.PatientInfoMapper;
import org.example.service.PatientService;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl extends ServiceImpl<PatientInfoMapper, PatientInfo>implements PatientService {
    private PatientInfoMapper patientInfoMapper;
}
