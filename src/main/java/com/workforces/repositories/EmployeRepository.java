package com.workforces.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.workforces.entities.Employe;

@Repository
@Component
public interface EmployeRepository extends CrudRepository<Employe, Long> {  
}
