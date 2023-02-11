package net.javaguides.userservice.service;

import net.javaguides.userservice.dto.ResponseDto;
import net.javaguides.userservice.entity.Doctor;

public interface DoctorService {
    Doctor saveDoctor(Doctor doctor);

    ResponseDto getDoctor(Long doctorId);


}
