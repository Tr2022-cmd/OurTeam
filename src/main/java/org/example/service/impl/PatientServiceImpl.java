package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.Patient_info;
import org.example.mapper.PatientInfoMapper;
import org.example.service.PatientService;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl extends ServiceImpl<PatientInfoMapper, Patient_info>implements PatientService {
}
