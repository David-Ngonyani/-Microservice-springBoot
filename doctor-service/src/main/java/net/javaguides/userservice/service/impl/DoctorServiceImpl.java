package net.javaguides.userservice.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.userservice.dto.*;
import net.javaguides.userservice.entity.Doctor;
import net.javaguides.userservice.repository.DoctorRepository;


import net.javaguides.userservice.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private DoctorRepository doctorRepository;
    private RestTemplate restTemplate;

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public ResponseDto getDoctor(Long doctorId) {

        ResponseDto responseDto = new ResponseDto();

        Doctor doctor = doctorRepository.findById(doctorId).get();
        DoctorDto doctorDto = mapToDoctor(doctor);

        ResponseEntity<TreatmentDto> responseTreatmentEntity = restTemplate
                .getForEntity("http://localhost:12/api/treatments/" + doctor.getTreatmentId(),
                        TreatmentDto.class);
        TreatmentDto treatmentDto = responseTreatmentEntity.getBody();
        System.out.println(responseTreatmentEntity.getStatusCode());


        ResponseEntity<PatientDto> responsePatientEntity = restTemplate
                .getForEntity("http://localhost:11/api/patients/" + doctor.getPatientId(),
                        PatientDto.class);
        PatientDto patientDto = responsePatientEntity.getBody();
        System.out.println(responsePatientEntity.getStatusCode());



        responseDto.setDoctorDto(doctorDto);
        responseDto.setTreatmentDto(treatmentDto);
        responseDto.setPatientDto(patientDto);

        return responseDto;
    }

    private DoctorDto mapToDoctor(Doctor doctor){
        DoctorDto doctorDto = new DoctorDto();
        doctorDto.setId(doctor.getId());
        doctorDto.setFirstName(doctor.getFirstName());
        doctorDto.setLastName(doctor.getLastName());
        doctorDto.setPhone_number(doctor.getPhone_number());
        doctorDto.setSpecialist(doctor.getSpecialist());
        return doctorDto;
    }
}