package az.edu.turing.flightbookingspring.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingEntity {

    private String bookerName;
    private String bookerSurname;


}