package net.javaguides.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javaguides.departmentservice.entity.Treatment;
import net.javaguides.departmentservice.repository.TreatmentRepository;
import net.javaguides.departmentservice.service.TreatmentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class TreatmentServiceImpl implements TreatmentService {

    private TreatmentRepository treatmentRepository;

    @Override
    public Treatment saveTreatment(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }

    @Override
    public Treatment getTreatmentById(Long treatmentId) {
        return treatmentRepository.findById(treatmentId).get();
    }
}