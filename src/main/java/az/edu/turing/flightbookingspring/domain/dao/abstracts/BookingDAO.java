package az.edu.turing.flightbookingspring.domain.dao.abstracts;

import az.edu.turing.flightbookingspring.domain.dao.DAO;
import az.edu.turing.flightbookingspring.domain.entities.BookingEntity;

import java.util.Collection;

public abstract class BookingDAO implements DAO<BookingEntity, Long> {

    public abstract Collection<BookingEntity> findAllByPassengerId(long passengerId);

    public abstract boolean cancelBooking(long bookingId);

    public abstract boolean existsById(long id);
}
