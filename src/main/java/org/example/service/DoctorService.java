package org.example.service;

import org.example.entity.DoctorInfo;

public interface DoctorService {
    /**
     * 根据医生ID查询医生信息
     * @param docId 医生ID
     * @return 医生信息，如果不存在返回null
     */
    DoctorInfo getDoctorById(Integer docId);
}
