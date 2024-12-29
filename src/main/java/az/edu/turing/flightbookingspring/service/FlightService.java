package az.edu.turing.flightbookingspring.service;

import az.edu.turing.flightbookingspring.entities.FlightEntity;
import az.edu.turing.flightbookingspring.dto.request.FlightRequest;
import az.edu.turing.flightbookingspring.dto.response.FlightResponse;

import java.util.List;

public interface FlightService {

    FlightEntity save(FlightEntity flightEntity);

    List<FlightEntity> findAll(FlightEntity flightEntity);

    FlightEntity findById(Long id);

    FlightEntity update(Long id, FlightEntity roll);

    void delete(Long id);

    FlightResponse getResponse(Long id, FlightRequest roll);

}
