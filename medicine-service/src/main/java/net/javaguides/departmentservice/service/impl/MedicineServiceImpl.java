package net.javaguides.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import net.javaguides.departmentservice.entity.Medicine;
import net.javaguides.departmentservice.repository.MedicineRepository;
import net.javaguides.departmentservice.service.MedicineService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MedicineServiceImpl implements MedicineService {

    private MedicineRepository medicineRepository;


    @Override
    public Medicine saveMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public Medicine getMedicineById(Long medicineId) {
        return medicineRepository.findById(medicineId).get();
    }
}