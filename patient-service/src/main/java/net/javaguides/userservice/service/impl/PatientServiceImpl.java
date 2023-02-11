package net.javaguides.userservice.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import net.javaguides.userservice.entity.Patient;
import net.javaguides.userservice.repository.PatientRepository;
import net.javaguides.userservice.service.PatientService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(Long patientId) {
        return patientRepository.findById(patientId).get();
    }
}