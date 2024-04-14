package com.hibernate.repo;

import java.util.List;
import org.hibernate.query.Order;
import org.hibernate.query.Page;
import org.springframework.stereotype.Repository;

import com.hibernate.model.Person;
import com.hibernate.model.PersonRecord;
import com.hibernate.model.Person_;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Person> searchByParams(String name, Integer age) {
        return PersonRepositoryDAO_.searchByParams(entityManager, name, age);
    }


    public List<Person> findPersonsByAge(Integer age) {
        return PersonRepositoryDAO_.findPersonsByAge(entityManager, age);
    }


    public Person findPersonByName(String name){
        return PersonRepositoryDAO_.findPersonByName(entityManager, name);
    }


    public List<Person> findPersonsByNamePaginated(String name){
        return PersonRepositoryDAO_.findPersonsByNamePaginated(entityManager, name, Page.page(10,0), Order.asc(Person_.name));
    }


    public String getPersonNameByAge(Integer age){
        return PersonRepositoryDAO_.getPersonNameByAge(entityManager,age);
    }


    public Object[] getPersonAttributesByName(String name){
        return PersonRepositoryDAO_.getPersonAttributesByName(entityManager,name);
    }


    public List<PersonRecord> getPersonRecordsByName(String name){
        return PersonRepositoryDAO_.getPersonRecordsByName(entityManager,name);
    }
}
