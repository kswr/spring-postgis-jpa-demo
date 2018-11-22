package com.kswr.spring.boot.postgis.demo.postgisdemo.controller;

import com.kswr.spring.boot.postgis.demo.postgisdemo.exception.ResourceNotFoundException;
import com.kswr.spring.boot.postgis.demo.postgisdemo.model.Voivodeship;
import com.kswr.spring.boot.postgis.demo.postgisdemo.repository.VoivodeshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoivodeshipController {

    @Autowired
    VoivodeshipRepository voivodeshipRepository;

    @GetMapping("/voiv/{id}")
    public Voivodeship getVoivodeshipById(@PathVariable(value = "id") Long id) {
        return voivodeshipRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Voivodeship " + id + " not found"));
    }
}
