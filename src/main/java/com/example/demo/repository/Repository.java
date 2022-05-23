package com.example.demo.repository;

import com.example.demo.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Agenda, Integer> {

}
