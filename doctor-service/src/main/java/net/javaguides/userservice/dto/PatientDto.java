package net.javaguides.userservice.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PatientDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String disease;
    private String phone_number;
}