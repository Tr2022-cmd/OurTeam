package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.DoctorInfo;
import org.example.mapper.DoctorInfoMapper;
import org.example.service.DoctorService;

public class DoctorServiceImpl extends ServiceImpl<DoctorInfoMapper, DoctorInfo> implements DoctorService {
    private DoctorInfoMapper doctorInfoMapper;
}
