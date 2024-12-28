package az.edu.turing.flightbookingspring.domain.dao.abstracts;

import az.edu.turing.flightbookingspring.domain.dao.DAO;
import az.edu.turing.flightbookingspring.domain.entities.FlightEntity;

import java.util.Collection;

public abstract class FlightDAO implements DAO<FlightEntity, Long> {

    public abstract Collection<FlightEntity> findAllWithInNext24Hours();

    public abstract Collection<FlightEntity> search(FlightSearchRequest request);
}
