package pharmacistservice.pharmacistservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pharmacistId;
    private String firstName;
    private String lastName;
    private String phone_number;
    private String email;
}
