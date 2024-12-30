package az.edu.turing.flightbookingspring.controller;


import az.edu.turing.flightbookingspring.dto.request.FlightRequest;
import az.edu.turing.flightbookingspring.dto.response.FlightResponse;
import az.edu.turing.flightbookingspring.entities.FlightEntity;
import az.edu.turing.flightbookingspring.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight/api/v2")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping("/save")
    public FlightEntity save(@RequestBody FlightEntity flightEntity) {
        return flightService.save(flightEntity);
    }

    @GetMapping("/list-all")
    public List<FlightEntity> findAll(FlightEntity flightEntity) {
        return flightService.findAll(flightEntity);
    }

    @GetMapping("/{id}")
    public FlightEntity findById(@PathVariable Long id) {
        return flightService.findById(id);
    }

    @GetMapping("/update/{id}")
    public FlightEntity update(@PathVariable Long id, @RequestBody FlightEntity flightEntity) {
        return flightService.update(id, flightEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        flightService.delete(id);
    }

    @GetMapping("/flight-response/{id}")
    public FlightResponse getResponse(@PathVariable Long id, @RequestBody FlightRequest flightRequest) {
        return flightService.getResponse(id, flightRequest);
    }

}
