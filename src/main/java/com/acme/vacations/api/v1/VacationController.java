package com.acme.vacations.api.v1;

import com.acme.vacations.model.Vacation;
import com.acme.vacations.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VacationController {
    private static final String URI = "/v1/vacations";
    private final VacationRepository repository;

    @Autowired
    VacationController(VacationRepository repository){
        this.repository = repository;
    }
    @GetMapping(URI)
    List<Vacation> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping(URI)
    Vacation newVacation(@RequestBody Vacation vacation) {
        return repository.save(vacation);
    }
}
