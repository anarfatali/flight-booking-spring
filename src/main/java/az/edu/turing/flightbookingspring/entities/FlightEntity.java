package az.edu.turing.flightbookingspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "flight_id")
    private Long flightId;

    @Column
    private String destination;

    @Column
    private String from;

    @Column(name = "departure_time")
    private LocalDateTime departureTime;

    @Column(name = "available_seats")
    private Integer availableSeats;

}
