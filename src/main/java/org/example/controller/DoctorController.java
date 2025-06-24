package org.example.controller;

import org.example.entity.DoctorInfo;
import org.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    /**
     * 根据医生ID查询医生信息
     * @param docId 医生ID
     * @return 医生信息或404状态码
     */
    @GetMapping("/{docId}")
    public ResponseEntity<DoctorInfo> getDoctorById(@PathVariable Integer docId) {
        DoctorInfo doctor = doctorService.getDoctorById(docId);
        return doctor != null
                ? ResponseEntity.ok(doctor)
                : ResponseEntity.notFound().build();
    }
}
