package org.example.controller;

import org.example.entity.Doctor_info;
import org.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    /**
     * 根据医生ID获取医生信息
     * @param docId 医生ID
     * @return 医生信息
     */
    @GetMapping("/{docId}")
    public ResponseEntity<?> getDoctorById(@PathVariable Integer docId) {
        try {
            Doctor_info doctor = doctorService.getDoctorById(docId);
            if (doctor == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("未找到ID为 " + docId + " 的医生");
            }
            return ResponseEntity.ok(doctor);
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body("获取医生信息时发生错误");
        }
    }
}
