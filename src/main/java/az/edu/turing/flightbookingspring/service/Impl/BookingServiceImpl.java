package az.edu.turing.flightbookingspring.service.Impl;

import az.edu.turing.flightbookingspring.entities.BookingEntity;
import az.edu.turing.flightbookingspring.dto.request.BookingRequest;
import az.edu.turing.flightbookingspring.dto.response.BookingResponse;
import az.edu.turing.flightbookingspring.exception.BookingNotFoundException;
import az.edu.turing.flightbookingspring.repository.BookingRepository;
import az.edu.turing.flightbookingspring.service.BookingService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    @Override
    public BookingEntity save(BookingEntity entity) {
        return bookingRepository.save(entity);
    }

    @Override
    public List<BookingEntity> findAll(BookingEntity bookingEntity) {
        return bookingRepository.findAll();
    }

    @Override
    public BookingEntity findById(Long id) {
        return bookingRepository.findById(id).orElseThrow(() -> new BookingNotFoundException("Not Found: " + id));
    }

    @Override
    public BookingEntity update(Long id, BookingEntity roll) {
        BookingEntity byId = findById(id);
        if (byId != null) {
            byId.setBookerName(roll.getBookerName());
            byId.setBookerSurname(roll.getBookerSurname());
            return bookingRepository.save(byId);
        }
        return null;

    }

    @Override
    public void delete(Long id) {
        BookingEntity byId = findById(id);
        if (byId != null) {
            bookingRepository.delete(byId);
        }

    }

    @Override
    public BookingResponse getResponse(Long id, BookingRequest roll) {
        BookingEntity byId = findById(id);
        if (byId != null) {
            BookingEntity bookingEntity1 = new BookingEntity();
            BeanUtils.copyProperties(roll, bookingEntity1);

            BookingEntity save = bookingRepository.save(bookingEntity1);
            BookingResponse bookingResponse = new BookingResponse();
            BeanUtils.copyProperties(save, bookingResponse);
            return bookingResponse;

        }
        return null;
    }


}
