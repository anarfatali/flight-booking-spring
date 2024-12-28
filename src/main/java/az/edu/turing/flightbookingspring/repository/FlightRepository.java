package az.edu.turing.flightbookingspring.repository;

import az.edu.turing.flightbookingspring.entities.FlightEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FlightRepository {

    private final JdbcTemplate jdbcTemplate;


    public FlightRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(FlightEntity flightEntity) {
        return jdbcTemplate.update("INSERT INTO flightEntities (destination,from,departureTime,availableSeats) VALUES (?, ?, ?, ?)",
                flightEntity.getDestination(), flightEntity.getFrom(), flightEntity.getDepartureTime(), flightEntity.getAvailableSeats());
    }
}
