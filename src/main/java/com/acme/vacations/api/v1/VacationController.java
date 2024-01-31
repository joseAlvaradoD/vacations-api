package com.acme.vacations.api.v1;

import com.acme.vacations.model.Vacation;
import com.acme.vacations.service.VacationService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VacationController {
    private static final String URI = "/v1/vacations";
    private final VacationService service;

    @Autowired
    VacationController(VacationService service){
        this.service = service;
    }
    @GetMapping(URI)
    List<Vacation> all() {
        return service.findAll();
    }
    // end::get-aggregate-root[]

    @GetMapping(URI+"/{id}")
    Vacation findById(@PathVariable("id") String id) {
        Vacation vacation = Vacation.builder().id(id).build();
        return service.findById(vacation);
    }

    @PostMapping(URI)
    ResponseEntity<Vacation> newVacation(@RequestBody Vacation vacation) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(vacation));
    }
}
