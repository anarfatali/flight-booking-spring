package az.edu.turing.flightbookingspring.service.Impl;

import az.edu.turing.flightbookingspring.domain.entities.FlightEntity;
import az.edu.turing.flightbookingspring.repository.FlightRepository;
import az.edu.turing.flightbookingspring.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }


    @Override
    public int save(FlightEntity entity) {
        return flightRepository.save(entity);
    }

}

