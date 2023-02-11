package net.javaguides.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private TreatmentDto treatmentDto;
    private DoctorDto doctorDto;
    private PatientDto patientDto;

}