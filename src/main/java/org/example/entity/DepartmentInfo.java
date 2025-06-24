package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@TableName("department_info")
@Schema(description = "部门信息实体")
public class DepartmentInfo {
    @Schema(description = "部门名称", example = "心血管内科")
    private String department_name;

    @Schema(description = "部门ID", example = "101")
    private int department_id;  // 修改为int类型

    @Schema(description = "部门位置", example = "门诊大楼3楼东区")
    private String location;

    @Schema(description = "部门电话", example = "028-12345678")
    private String dp_phone;

    // ==================== Getter/Setter ====================
    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    // 保留String类型的setter方法（兼容旧代码）
    public void setDepartment_id(String department_id) {
        try {
            this.department_id = Integer.parseInt(department_id);
        } catch (NumberFormatException e) {
            this.department_id = 0; // 或根据业务需求设置为其他默认值
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDp_phone() {
        return dp_phone;
    }

    public void setDp_phone(String dp_phone) {
        this.dp_phone = dp_phone;
    }
}
