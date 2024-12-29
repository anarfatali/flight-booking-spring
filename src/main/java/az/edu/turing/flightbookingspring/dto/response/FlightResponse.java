package az.edu.turing.flightbookingspring.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FlightResponse {

    private String destination;
    private String from;
    private LocalDateTime departureTime;

}
