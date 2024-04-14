package com.hibernate.naming.repo;

import org.springframework.data.repository.CrudRepository;

import com.hibernate.naming.model.Person;

public interface PersonRepo extends CrudRepository<Person, Long> {

}
