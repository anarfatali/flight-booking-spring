package az.edu.turing.flightbookingspring.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FlightRequest {

    private Long flightId;
    private String destination;
    private String from;
    private LocalDateTime departureTime;
    private Integer availableSeats;
}
