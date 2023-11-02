package org.abolfazl.service;

import lombok.RequiredArgsConstructor;
import org.abolfazl.entity.Person;
import org.abolfazl.repository.PersonDA;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonDA personDA;

    @Transactional
    public void save(Person person){
        personDA.save(person);
    }

    @Transactional
    public void update(Person person){
        personDA.update(person);
    }

    @Transactional
    public void remove(Person person){
        personDA.remove(person);
    }

    public List<Person> findAll(){
        return personDA.findAll();
    }

    public Person findOne(Person person){
        return personDA.findOne(person.getId());
    }
}
