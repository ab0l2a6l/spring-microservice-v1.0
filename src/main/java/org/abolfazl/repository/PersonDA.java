package org.abolfazl.repository;

import lombok.extern.slf4j.Slf4j;
import org.abolfazl.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Slf4j
public class PersonDA {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Person person){
        log.info("invoke save . . .");
        entityManager.persist(person);
    }

    public void update(Person person){
        log.info("invoke update . . .");
        entityManager.merge(person);
    }

    public void remove(Person person){
        log.info("invoke remove . . .");
        entityManager.remove(entityManager.merge(person));
    }

    public List<Person> findAll(){
        log.info("invoke findAll . . .");
        return entityManager.createQuery("select o from person o").getResultList();
    }

    public Person findOne(long id){
        log.info("invoke findOne . . .");
        return entityManager.find(Person.class, id);
    }
}
