package com.kswr.spring.boot.postgis.demo.postgisdemo.controller;

import com.kswr.spring.boot.postgis.demo.postgisdemo.exception.ResourceNotFoundException;
import com.kswr.spring.boot.postgis.demo.postgisdemo.model.State;
import com.kswr.spring.boot.postgis.demo.postgisdemo.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

    @Autowired
    StateRepository stateRepository;

    @GetMapping("/state/{id}")
    public State getStateById(@PathVariable(value = "id") Long id) {
        return stateRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("State " + id + " not found"));
    }
}
