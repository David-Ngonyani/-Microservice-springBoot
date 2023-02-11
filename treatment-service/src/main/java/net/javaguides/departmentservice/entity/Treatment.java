package net.javaguides.departmentservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "treatments")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String treatmentName;
    private String dateStarted;
    private String dateEnded;
}