package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
@TableName("doctor_info")
@Schema(description = "医生信息实体")
public class Doctor_info {
    // ==================== 枚举定义 ====================
    @Schema(description = "医生职称等级")
    public enum DoctorRank {
        @Schema(description = "医师助理") 医师助理,
        @Schema(description = "住院医师") 住院医师,
        @Schema(description = "主治医师") 主治医师,
        @Schema(description = "副主任医师") 副主任医师,
        @Schema(description = "主任医师") 主任医师,
        @Schema(description = "非医务人员") 非医务人员
    }

    // ==================== 字段声明 ====================
    @Schema(description = "医生ID", example = "1001")
    private int doc_id;  // 改为int类型

    @Schema(description = "医生姓名", example = "张医生")
    private String doc_name;

    @Schema(description = "医生职称",
            allowableValues = {"医师助理", "住院医师", "主治医师",
                    "副主任医师", "主任医师", "非医务人员"})
    private DoctorRank doc_rank;  // 改为枚举类型

    @Schema(description = "联系电话", example = "13800138000")
    private String doc_phone;

    @Schema(description = "所属部门ID", example = "201")
    private int doc_dp_id;  // 改为int类型

    @Schema(description = "挂号费(分)", example = "5000")  // 单位：分
    private int doc_fee;  // 改为int类型（建议用分存储避免小数）

    // ==================== Getter/Setter ====================
    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    // 保留String类型的setter（兼容旧代码）
    public void setDoc_id(String doc_id) {
        try {
            this.doc_id = Integer.parseInt(doc_id);
        } catch (NumberFormatException e) {
            this.doc_id = 0;
        }
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public DoctorRank getDoc_rank() {
        return doc_rank;
    }

    public void setDoc_rank(DoctorRank doc_rank) {
        this.doc_rank = doc_rank;
    }

    // 支持String类型输入的setter
    public void setDoc_rank(String doc_rank) {
        try {
            this.doc_rank = DoctorRank.valueOf(doc_rank);
        } catch (IllegalArgumentException e) {
            this.doc_rank = null;
        }
    }

    public String getDoc_phone() {
        return doc_phone;
    }

    public void setDoc_phone(String doc_phone) {
        this.doc_phone = doc_phone;
    }

    public int getDoc_dp_id() {
        return doc_dp_id;
    }

    public void setDoc_dp_id(int doc_dp_id) {
        this.doc_dp_id = doc_dp_id;
    }

    // 保留String类型的setter（兼容旧代码）
    public void setDoc_dp_id(String doc_dp_id) {
        try {
            this.doc_dp_id = Integer.parseInt(doc_dp_id);
        } catch (NumberFormatException e) {
            this.doc_dp_id = 0;
        }
    }

    public int getDoc_fee() {
        return doc_fee;
    }

    public void setDoc_fee(int doc_fee) {
        this.doc_fee = doc_fee;
    }

    // 支持String类型输入的setter
    public void setDoc_fee(String doc_fee) {
        try {
            this.doc_fee = Integer.parseInt(doc_fee);
        } catch (NumberFormatException e) {
            this.doc_fee = 0;
        }
    }

    // ==================== 工具方法 ====================
    @Schema(description = "获取格式化挂号费（元）", example = "50.00")
    public String getFormattedFee() {
        return String.format("%.2f", doc_fee / 100.0); // 分转元
    }
}
