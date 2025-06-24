package org.example.service.impl;

import org.example.entity.DoctorInfo;
import org.example.mapper.DoctorMapper;
import org.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public DoctorInfo getDoctorById(Integer docId) {
        return doctorMapper.selectById(docId);
    }
}
