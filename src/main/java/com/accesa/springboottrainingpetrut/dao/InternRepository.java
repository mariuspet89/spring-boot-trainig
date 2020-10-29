package com.accesa.springboottrainingpetrut.dao;

import com.accesa.springboottrainingpetrut.entity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface InternRepository extends JpaRepository<Intern, Long> {

    Optional<Intern> findByName(String name);
}
