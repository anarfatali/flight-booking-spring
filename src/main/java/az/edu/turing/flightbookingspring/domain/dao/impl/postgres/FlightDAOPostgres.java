package az.edu.turing.flightbookingspring.domain.dao.impl.postgres;

import az.edu.turing.flightbookingspring.domain.dao.abstracts.FlightDAO;
import az.edu.turing.flightbookingspring.domain.entities.FlightEntity;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FlightDAOPostgres extends FlightDAO {
    @Override
    public Collection<FlightEntity> findAll() {
        return List.of();
    }

    @Override
    public FlightEntity create(FlightEntity entity) {
        return null;
    }

    @Override
    public Optional<FlightEntity> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Collection<FlightEntity> findAllWithInNext24Hours() {
        return List.of();
    }

    @Override
    public Collection<FlightEntity> search(FlightSearchRequest request) {
        return List.of();
    }
}
