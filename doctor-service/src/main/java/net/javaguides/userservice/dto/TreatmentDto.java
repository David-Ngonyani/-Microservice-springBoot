package net.javaguides.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TreatmentDto {
    private Long id;
    private String treatmentName;
    private String dateStarted;
    private String dateEnded;
}