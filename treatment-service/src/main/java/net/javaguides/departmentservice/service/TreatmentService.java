package net.javaguides.departmentservice.service;


import net.javaguides.departmentservice.entity.Treatment;

public interface TreatmentService {
    Treatment saveTreatment(Treatment treatment);

    Treatment getTreatmentById(Long treatmentId);
}