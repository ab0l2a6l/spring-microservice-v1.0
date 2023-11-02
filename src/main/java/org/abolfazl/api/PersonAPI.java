package org.abolfazl.api;

import lombok.RequiredArgsConstructor;
import org.abolfazl.entity.Person;
import org.abolfazl.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class PersonAPI {
    private final PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<Object> save(@RequestBody Person person){
        personService.save(person);
        return ResponseEntity.ok(person);
    }

    @PostMapping("/update")
    public ResponseEntity<Object> update(@RequestBody Person person){
        personService.update(person);
        return ResponseEntity.ok(person);
    }

    @PostMapping("/remove")
    public Object remove(@RequestBody Person person){
        personService.remove(person);
        return "deleted";
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }

    @PostMapping("/findOne")
    public ResponseEntity<Object> findOne(@RequestBody Person person){
        return ResponseEntity.ok(personService.findOne(person));
    }
}
