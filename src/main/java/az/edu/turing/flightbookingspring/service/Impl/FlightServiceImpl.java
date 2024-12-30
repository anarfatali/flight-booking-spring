package az.edu.turing.flightbookingspring.service.Impl;

import az.edu.turing.flightbookingspring.dto.request.FlightRequest;
import az.edu.turing.flightbookingspring.dto.response.FlightResponse;
import az.edu.turing.flightbookingspring.entities.FlightEntity;
import az.edu.turing.flightbookingspring.exception.FlightNotFoundException;
import az.edu.turing.flightbookingspring.repository.FlightRepository;
import az.edu.turing.flightbookingspring.service.FlightService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;


    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }


    @Override
    public FlightEntity save(FlightEntity flightEntity) {
        return flightRepository.save(flightEntity);
    }

    @Override
    public List<FlightEntity> findAll(FlightEntity flightEntity) {
        return flightRepository.findAll();
    }

    @Override
    public FlightEntity findById(Long id) {
        return flightRepository.findById(id).orElseThrow(() -> new FlightNotFoundException("Not Found " + id));
    }

    @Override
    public FlightEntity update(Long id, FlightEntity flightEntity) {
        FlightEntity byId = findById(id);
        if (byId != null) {
            byId.setDestination(flightEntity.getDestination());
            byId.setFrom(flightEntity.getFrom());
            byId.setDepartureTime(flightEntity.getDepartureTime());
            byId.setAvailableSeats(flightEntity.getAvailableSeats());
            return flightRepository.save(byId);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        FlightEntity byId = findById(id);
        if (byId != null) {
            flightRepository.delete(byId);
        }


    }

    @Override
    public FlightResponse getResponse(Long id, FlightRequest roll) {
        FlightEntity byId = findById(id);
        if (byId != null) {
            FlightEntity flightEntity1 = new FlightEntity();
            BeanUtils.copyProperties(roll, flightEntity1);

            FlightResponse flightResponse = new FlightResponse();
            FlightEntity save = flightRepository.save(flightEntity1);
            BeanUtils.copyProperties(save, flightResponse);
            return flightResponse;

        }
        return null;

    }

}

