package az.edu.turing.flightbookingspring.controller;


import az.edu.turing.flightbookingspring.domain.entities.BookingEntity;
import az.edu.turing.flightbookingspring.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking/api/v1")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/save")
    public String save(@RequestBody BookingEntity entity) {
        bookingService.save(entity);
        return "BookingEntity added successfully!";
    }


}
