package az.edu.turing.flightbookingspring.repository;


import az.edu.turing.flightbookingspring.domain.entities.BookingEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookingRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookingRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(BookingEntity bookingEntity) {
        return jdbcTemplate.update("INSERT INTO bookingEntities (bookerName, bookerSurname) VALUES (?, ?)",
                bookingEntity.getBookerName(), bookingEntity.getBookerSurname());
    }


}
