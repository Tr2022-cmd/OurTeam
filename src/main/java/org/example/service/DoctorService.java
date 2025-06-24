package org.example.service;

import org.example.entity.DoctorInfo;

public interface DoctorService {
    // 根据医生ID查询医生信息
    DoctorInfo getDoctorById(Integer docId);
}
