package com.workforces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workforces.entities.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
