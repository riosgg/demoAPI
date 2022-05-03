package com.example.demo.controller;

import com.example.demo.model.Name;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")

public class Controller {

    @Autowired
    private Repository repository;

    @PostMapping("/post")
    public void save(@RequestBody Name nametst) {
        repository.save(nametst);
    }

    @GetMapping("/list")
    public List<Name> listAll(){
        return repository.findAll();

    }
/*
    @GetMapping("/listAll")
    public List<Name> listId(@PathVariable("id") Integer id){
        return repository.findById(id);

    }
*/

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);

    }

}