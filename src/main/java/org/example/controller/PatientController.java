package org.example.controller;

import org.example.entity.Patient_info;
import org.example.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public boolean registerPatient(@RequestBody Patient_info patientInfo) {
        return patientService.save(patientInfo);
    }
}
