package az.edu.turing.flightbookingspring.controller;


import az.edu.turing.flightbookingspring.dto.request.BookingRequest;
import az.edu.turing.flightbookingspring.dto.response.BookingResponse;
import az.edu.turing.flightbookingspring.entities.BookingEntity;
import az.edu.turing.flightbookingspring.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking/api/v1")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }


    @PostMapping("/save")
    public BookingEntity save(@RequestBody BookingEntity bookingEntity) {
        return bookingService.save(bookingEntity);
    }

    @GetMapping("/list-all")
    public List<BookingEntity> findAll(BookingEntity bookingEntity) {
        return bookingService.findAll(bookingEntity);
    }

    @GetMapping("/{id}")
    public BookingEntity findById(@PathVariable Long id) {
        return bookingService.findById(id);
    }

    @GetMapping("/update/{id}")
    public BookingEntity update(@PathVariable Long id, @RequestBody BookingEntity bookingEntity) {
        return bookingService.update(id, bookingEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        bookingService.delete(id);
    }

    @GetMapping("/booking-response/{id}")
    public BookingResponse getResponse(@PathVariable Long id, @RequestBody BookingRequest bookingRequest) {
        return bookingService.getResponse(id, bookingRequest);
    }

}
