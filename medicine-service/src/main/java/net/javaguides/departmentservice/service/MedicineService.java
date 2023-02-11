package net.javaguides.departmentservice.service;


import net.javaguides.departmentservice.entity.Medicine;

public interface MedicineService {
    Medicine saveMedicine(Medicine medicine);

    Medicine getMedicineById(Long medicineId);
}