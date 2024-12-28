package az.edu.turing.flightbookingspring.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightEntity {

    private Long flightId;
    private String destination;
    private String from;
    private LocalDateTime departureTime;
    private Integer availableSeats;
}
