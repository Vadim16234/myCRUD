package com.example.mycrud.service;

import com.example.mycrud.model.People;
import com.example.mycrud.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

//    @GetMapping("/{id}")
    public People findById(@PathVariable("id") Long id) {
        return peopleRepository.getOne(id);
    }

    @PutMapping("/people-create")
    public List<People> findAll(){
        return peopleRepository.findAll();
    }

    @DeleteMapping("/people-delete")
    public String deleteById(Long id) {
        peopleRepository.deleteById(id);
        return null;
    }


}
