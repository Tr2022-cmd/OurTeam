package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
@TableName("arrange_info")
@Schema(description = "排班信息实体")
public class ArrangeInfo {
    // ==================== 枚举定义 ====================
    @Schema(description = "排班时间段枚举")
    public enum TimeSlot {
        @Schema(description = "08:00-09:00") SLOT_8_9("8:00-9:00"),
        @Schema(description = "09:00-10:00") SLOT_9_10("9:00-10:00"),
        @Schema(description = "10:00-11:00") SLOT_10_11("10:00-11:00"),
        @Schema(description = "11:00-12:00") SLOT_11_12("11:00-12:00"),
        @Schema(description = "13:00-14:00") SLOT_13_14("13:00-14:00"),
        @Schema(description = "14:00-15:00") SLOT_14_15("14:00-15:00"),
        @Schema(description = "15:00-16:00") SLOT_15_16("15:00-16:00"),
        @Schema(description = "16:00-17:00") SLOT_16_17("16:00-17:00"),
        @Schema(description = "17:00-18:00") SLOT_17_18("17:00-18:00");

        private final String displayValue;

        TimeSlot(String displayValue) {
            this.displayValue = displayValue;
        }

        public String getDisplayValue() {
            return displayValue;
        }
    }

    // ==================== 字段声明 ====================
    @Schema(description = "排班ID", example = "1")
    private int arrange_id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Schema(description = "排班日期", example = "2023-10-01")
    private Date arrange_date;  // 修改为Date类型

    @Schema(description = "排班时间段",
            allowableValues = {"8:00-9:00", "9:00-10:00", "10:00-11:00",
                    "11:00-12:00", "13:00-14:00", "14:00-15:00",
                    "15:00-16:00", "16:00-17:00", "17:00-18:00"})
    private TimeSlot arrange_timezone;  // 修改为枚举类型

    @Schema(description = "号余量", example = "10")
    private int arrange_balance;

    @Schema(description = "医生ID", example = "1001")
    private int arrange_doc_id;

    // ==================== Getter/Setter ====================
    public int getArrange_id() {
        return arrange_id;
    }

    public void setArrange_id(int arrange_id) {
        this.arrange_id = arrange_id;
    }

    public Date getArrange_date() {
        return arrange_date;
    }

    public void setArrange_date(Date arrange_date) {
        this.arrange_date = arrange_date;
    }

    public TimeSlot getArrange_timezone() {
        return arrange_timezone;
    }

    public void setArrange_timezone(TimeSlot arrange_timezone) {
        this.arrange_timezone = arrange_timezone;
    }

    // 添加支持String输入的setter方法
    public void setArrange_timezone(String timezone) {
        if (timezone == null || timezone.trim().isEmpty()) {
            this.arrange_timezone = null;
        } else {
            try {
                this.arrange_timezone = TimeSlot.valueOf("SLOT_" + timezone.replace(":", "").replace("-", "_"));
            } catch (IllegalArgumentException e) {
                this.arrange_timezone = null; // 或抛出自定义异常
            }
        }
    }

    public int getArrange_balance() {
        return arrange_balance;
    }

    public void setArrange_balance(int arrange_balance) {
        this.arrange_balance = arrange_balance;
    }

    public int getArrange_doc_id() {
        return arrange_doc_id;
    }

    public void setArrange_doc_id(int arrange_doc_id) {
        this.arrange_doc_id = arrange_doc_id;
    }

    // ==================== 工具方法 ====================
    public String getTimeSlotDisplay() {
        return arrange_timezone != null ? arrange_timezone.getDisplayValue() : null;
    }
}
