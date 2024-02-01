package com.acme.vacations.service;

import com.acme.vacations.model.Vacation;
import com.acme.vacations.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class VacationService {
    private final VacationRepository repository;

    @Autowired
    VacationService(VacationRepository repository){
        this.repository = repository;
    }

    public List<Vacation> findAll(){
        return this.repository.findAll();
    }

    @Cacheable(value = "vacation", key = "#vacation.id")
    public Vacation findById(Vacation vacation){
        return this.repository.findById(vacation.getId()).orElseThrow(()-> new NoSuchElementException("There is not exist any vacation package with the id: " + vacation.getId()));
    }

    public Vacation insert(Vacation vacation){
        return this.repository.insert(vacation);
    }
}
