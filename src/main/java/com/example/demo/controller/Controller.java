package com.example.demo.controller;

import com.example.demo.model.Name;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/phonebook")

public class Controller {

    @Autowired
    private Repository repository;

    @PostMapping("")
    public void save(@RequestBody Name nametst) {
        repository.save(nametst);
    }

    @GetMapping("")
    public List<Name> listAll(){
        return repository.findAll();

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);

    }

}