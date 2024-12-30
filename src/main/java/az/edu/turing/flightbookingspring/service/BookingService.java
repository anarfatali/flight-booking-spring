package az.edu.turing.flightbookingspring.service;

import az.edu.turing.flightbookingspring.dto.request.BookingRequest;
import az.edu.turing.flightbookingspring.dto.response.BookingResponse;
import az.edu.turing.flightbookingspring.entities.BookingEntity;

import java.util.List;

public interface BookingService {

    BookingEntity save(BookingEntity bookingEntity);

    List<BookingEntity> findAll(BookingEntity bookingEntity);

    BookingEntity findById(Long id);

    BookingEntity update(Long id, BookingEntity roll);

    void delete(Long id);

    BookingResponse getResponse(Long id, BookingRequest roll);

}
