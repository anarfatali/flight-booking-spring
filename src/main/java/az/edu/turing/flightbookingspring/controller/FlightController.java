package az.edu.turing.flightbookingspring.controller;

import az.edu.turing.flightbookingspring.domain.entities.FlightEntity;
import az.edu.turing.flightbookingspring.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight/api/v2")
public class FlightController {

    private final FlightService flightService;


    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping("/save")
    public String save(@RequestBody FlightEntity entity) {
        flightService.save(entity);
        return "FlightEntity added successfully!";
    }

}
