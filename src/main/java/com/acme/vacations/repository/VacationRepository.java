package com.acme.vacations.repository;

import com.acme.vacations.model.Vacation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VacationRepository extends MongoRepository<Vacation, String> {
}
