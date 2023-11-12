package com.example.mycrud.controller;

import com.example.mycrud.model.People;
import com.example.mycrud.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/people")
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping("/all")
    public List<People> getAll(){
        return peopleService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<People> getID(@PathVariable(required = false) Long id){
        return peopleService.findById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id){
        peopleService.deleteById(id);
        return true;
    }

    @PostMapping
    public People savePeople(@RequestBody People people) {
        return peopleService.addPeople(people);
    }
}
