package az.edu.turing.flightbookingspring.service.Impl;

import az.edu.turing.flightbookingspring.entities.BookingEntity;
import az.edu.turing.flightbookingspring.repository.BookingRepository;
import az.edu.turing.flightbookingspring.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    @Override
    public int save(BookingEntity entity) {
        return bookingRepository.save(entity);
    }


}
