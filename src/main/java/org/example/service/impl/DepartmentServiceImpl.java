package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.DepartmentInfo;
import org.example.mapper.DepartmentInfoMapper;
import org.example.service.DepartmentService;

public class DepartmentServiceImpl extends ServiceImpl<DepartmentInfoMapper, DepartmentInfo> implements DepartmentService {
    private DepartmentInfoMapper departmentInfoMapper;
}
