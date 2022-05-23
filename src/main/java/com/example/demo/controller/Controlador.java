package com.example.demo.controller;

import com.example.demo.model.Agenda;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/agenda")

public class Controlador {

    @Autowired
    private Repository repository;

    @PostMapping("")
    public void guardar(@RequestBody Agenda agenda) {
        repository.save(agenda);
    }

    @PutMapping ("/{id}")
    public void actualizar(@RequestBody Agenda agenda, @PathVariable("id") Integer id ) {
        Agenda _actualizar = repository.getById(id);
        _actualizar.setNombre(agenda.getNombre());
        _actualizar.setNumero(agenda.getNumero());
        repository.save(_actualizar);
    }

    @GetMapping("")
    public List<Agenda> listar(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        repository.deleteById(id);

    }

}