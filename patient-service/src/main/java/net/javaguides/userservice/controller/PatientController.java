package net.javaguides.userservice.controller;

import lombok.AllArgsConstructor;
import net.javaguides.userservice.entity.Patient;
import net.javaguides.userservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/patients")
@AllArgsConstructor
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient){
        Patient savedPatient = patientService.savePatient(patient);
        return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long patientId){
        Patient patient = patientService.getPatientById(patientId);
        return ResponseEntity.ok(patient);
    }
}