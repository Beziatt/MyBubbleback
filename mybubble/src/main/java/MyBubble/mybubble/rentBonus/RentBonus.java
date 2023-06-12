package MyBubble.demo.rentBonus;

import MyBubble.demo.Bubble.Bubble;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RentBonus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bonus;
    private Boolean isBonus;

    @OneToOne(mappedBy = "rentBonus")
    @JsonIgnoreProperties("rentBonus")
    private Bubble bubble;
}