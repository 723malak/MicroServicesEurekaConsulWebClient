package ma.emsi.voiture.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {
    @Id
    private Long id;
    private String brand;
    private String model;
    private String matricule;
    private Long client_id;
}
