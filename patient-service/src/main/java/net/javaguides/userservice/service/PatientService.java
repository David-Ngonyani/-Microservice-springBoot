package net.javaguides.userservice.service;


import net.javaguides.userservice.entity.Patient;

public interface PatientService {
    Patient savePatient(Patient patient);

    Patient getPatientById(Long patientId);
}