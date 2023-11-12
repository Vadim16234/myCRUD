package com.example.mycrud.service;

import com.example.mycrud.model.People;
import com.example.mycrud.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PeopleService {

    private final PeopleRepository peopleRepository;

    public Optional<People> findById(Long id) {
        return peopleRepository.findById(id);
    }

    public List<People> findAll(){
        return peopleRepository.findAll();
    }

    public void deleteById(Long id) {
        peopleRepository.deleteById(id);
    }

    public People addPeople(People people){
        return peopleRepository.save(people);
    }

//    public String updatePeopleById(Long id){
//        peopleRepository.findById(id);
//
//    }
}
