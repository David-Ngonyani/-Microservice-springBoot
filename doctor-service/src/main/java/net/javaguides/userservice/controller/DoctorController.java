package net.javaguides.userservice.controller;

import lombok.AllArgsConstructor;
import net.javaguides.userservice.dto.ResponseDto;
import net.javaguides.userservice.entity.Doctor;
import net.javaguides.userservice.service.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/doctors")
@AllArgsConstructor
public class DoctorController {

    private DoctorService doctorService;

    @PostMapping("/add")
    public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor){
        Doctor savedDoctor = doctorService.saveDoctor(doctor);
        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getDoctor(@PathVariable("id") Long doctorId){
        ResponseDto responseDto = doctorService.getDoctor(doctorId);
        return ResponseEntity.ok(responseDto);
    }
}