package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.PrescriptionInfo;
import org.example.mapper.PrescriptionInfoMapper;
import org.example.service.PrescriptionService;

public class PrescriptionServiceImpl extends ServiceImpl<PrescriptionInfoMapper, PrescriptionInfo> implements PrescriptionService {
    private PrescriptionInfoMapper prescriptionInfoMapper;
}
