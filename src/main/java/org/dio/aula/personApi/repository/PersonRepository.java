package org.dio.aula.personApi.repository;

import org.dio.aula.personApi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}