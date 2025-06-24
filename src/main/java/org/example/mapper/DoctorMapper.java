package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.entity.DoctorInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DoctorMapper extends BaseMapper<DoctorInfo> {
    // 继承BaseMapper已包含selectById方法
    // 不需要额外方法
}
