package com.kswr.spring.boot.postgis.demo.postgisdemo.controller;

import com.kswr.spring.boot.postgis.demo.postgisdemo.exception.ResourceNotFoundException;
import com.kswr.spring.boot.postgis.demo.postgisdemo.model.Gmina;
import com.kswr.spring.boot.postgis.demo.postgisdemo.repository.GminaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GminaController {

    @Autowired
    GminaRepository gminaRepository;

    @GetMapping("/gmina/{id}")
    public Gmina getGminaById(@PathVariable(value = "id") Long id) {
        return gminaRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Gmina " + id + " not found"));
    }

    @GetMapping("/gminas")
    public List<Gmina> getSomeGmina() {
        List<Long> longs = new ArrayList<>();
        for (long i = 1; i < 11; i++) {
            longs.add(i);
        }
        return gminaRepository.findAllById(longs);
    }

    @GetMapping("/gminas/{number}")
    public List<Gmina> getSomeGmina(@PathVariable(value = "number") Long number) {
        List<Long> longs = new ArrayList<>();
        for (long i = 1; i <= number; i++) {
            longs.add(i);
        }
        return gminaRepository.findAllById(longs);
    }

}
