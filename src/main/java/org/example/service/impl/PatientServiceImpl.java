package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.PatientInfo;
import org.example.mapper.PatientInfoMapper;
import org.example.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl extends ServiceImpl<PatientInfoMapper, PatientInfo> implements PatientService {


    @Override
    public List<PatientInfo> queryPatients(Integer healthcardId, String identificationId, String name) {
        QueryWrapper<PatientInfo> queryWrapper = new QueryWrapper<>();

        if (healthcardId != null) {
            queryWrapper.eq("healthcard_id", healthcardId);
        }

        if (identificationId != null) {
            queryWrapper.eq("identification_id", identificationId);
        }

        if (name != null) {
            queryWrapper.like("name", name); // 使用like实现模糊查询
        }

        return list(queryWrapper);
    }
    @Override
    public boolean updateByHealthcardId(Integer healthcardId, PatientInfo patientInfo) {
        // 确保输入不为空
        if (healthcardId == null || patientInfo == null) {
            throw new IllegalArgumentException("healthcardId 和 patientInfo 不能为空");
        }

        // 1. 构建更新条件
        QueryWrapper<PatientInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("healthcard_id", healthcardId);

        // 2. 不更新就诊卡号本身
        // 这里不需要设置为null，保持原值

        // 3. 执行更新
        return update(patientInfo, queryWrapper);
    }
}
