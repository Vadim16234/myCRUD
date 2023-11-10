package com.example.mycrud.controller;

import com.example.mycrud.model.People;
import com.example.mycrud.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/people")
public class PeopleController {

    private final PeopleService peopleService;
//
//    @Autowired
//    public PeopleController(PeopleService peopleService) {
//        this.peopleService = peopleService;
//    }

    @GetMapping("/all")
    public List<People> getAll(){
        return peopleService.findAll();
    }

    @GetMapping("/id/{id}")
    public List<People> getID(@PathVariable("id") Long id){
        return (List<People>) peopleService.findById(id);
    }

    @DeleteMapping("deleteId/{id}")
    public String deleteById(@PathVariable("id") Long id){
        return peopleService.deleteById(id);
    }

}
