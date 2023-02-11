package net.javaguides.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.javaguides.departmentservice.entity.Treatment;
import net.javaguides.departmentservice.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/treatments")
@AllArgsConstructor
public class TreatmentController {

    @Autowired
    private TreatmentService treatmentService;

    @PostMapping
    public ResponseEntity<Treatment> saveTreatment(@RequestBody Treatment treatment){
        Treatment savedTreatment = treatmentService.saveTreatment(treatment);
        return new ResponseEntity<>(savedTreatment, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Treatment> getDepartmentById(@PathVariable("id") Long treatmentId){
        Treatment department = treatmentService.getTreatmentById(treatmentId);
        return ResponseEntity.ok(department);
    }
}