package net.javaguides.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.javaguides.departmentservice.entity.Medicine;
import net.javaguides.departmentservice.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/medicines")
@AllArgsConstructor
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping
    public ResponseEntity<Medicine> saveMedicine(@RequestBody Medicine medicine){
        Medicine savedMedicine = medicineService.saveMedicine(medicine);
        return new ResponseEntity<>(savedMedicine, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Medicine> getMedicineById(@PathVariable("id") Long medicineId){
        Medicine medicine = medicineService.getMedicineById(medicineId);
        return ResponseEntity.ok(medicine);
    }
}