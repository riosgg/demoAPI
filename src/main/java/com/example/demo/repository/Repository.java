package com.example.demo.repository;

import com.example.demo.model.Name;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Name, Integer> {

}
