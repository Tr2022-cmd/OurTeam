package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.entity.DoctorInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DoctorMapper extends BaseMapper<DoctorInfo> {
    // 继承BaseMapper已包含基本CRUD操作
    // 如需自定义查询可添加如下方法：
    DoctorInfo selectByDocId(Integer docId);
}
