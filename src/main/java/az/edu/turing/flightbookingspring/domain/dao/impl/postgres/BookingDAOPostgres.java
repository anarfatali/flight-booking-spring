package az.edu.turing.flightbookingspring.domain.dao.impl.postgres;

import az.edu.turing.flightbookingspring.domain.dao.abstracts.BookingDAO;
import az.edu.turing.flightbookingspring.domain.entities.BookingEntity;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class BookingDAOPostgres extends BookingDAO {
    @Override
    public Collection<BookingEntity> findAll() {
        return List.of();
    }

    @Override
    public BookingEntity create(BookingEntity entity) {
        return null;
    }

    @Override
    public Optional<BookingEntity> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Collection<BookingEntity> findAllByPassengerId(long passengerId) {
        return List.of();
    }

    @Override
    public boolean cancelBooking(long bookingId) {
        return false;
    }

    @Override
    public boolean existsById(long id) {
        return false;
    }
}
