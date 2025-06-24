package org.example.service;

import org.example.entity.Doctor_info;

public interface DoctorService {
    // 根据医生ID查询医生信息
    Doctor_info getDoctorById(Integer docId);
}
