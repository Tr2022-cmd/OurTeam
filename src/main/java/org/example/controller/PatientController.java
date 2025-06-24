package org.example.controller;

import org.example.entity.PatientInfo;
import org.example.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    /**
     * 接收前端提交的病人信息并保存到数据库
     * @param patientInfo 前端传递的JSON数据（自动转换为Patient_info对象）
     * @return 保存成功返回true，失败返回false
     */
    @PostMapping("/register")
    public boolean registerPatient(@RequestBody PatientInfo patientInfo) {
        return patientService.save(patientInfo);
    }
    @DeleteMapping("/delete/{healthcardId}")
    public boolean deletePatient(@PathVariable int healthcardId) {
        return patientService.removeById(healthcardId);
    }

    @GetMapping("/query")
    public List<PatientInfo> queryPatients(
            @RequestParam(required = false) Integer healthcardId,
            @RequestParam(required = false) String identificationId,
            @RequestParam(required = false) String name) {

        if (healthcardId == null && identificationId == null && name == null) {
            throw new IllegalArgumentException("至少需要提供一个查询参数（就诊卡号、证件号或姓名）");
        }

        return patientService.queryPatients(healthcardId, identificationId, name);
    }
    @PutMapping("/updateByHealthcard/{healthcardId}")
    public boolean updateByHealthcardId(
            @PathVariable Integer healthcardId,
            @RequestBody PatientInfo patientInfo) {
        return patientService.updateByHealthcardId(healthcardId, patientInfo);
    }
}
