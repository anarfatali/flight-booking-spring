package az.edu.turing.flightbookingspring.dto.request;

import lombok.Data;

@Data
public class BookingRequest {

    private Long BookingId;
    private String bookerName;
    private String bookerSurname;
}
