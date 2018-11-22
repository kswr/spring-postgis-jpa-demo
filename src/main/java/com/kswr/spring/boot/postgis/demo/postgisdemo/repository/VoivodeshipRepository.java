package com.kswr.spring.boot.postgis.demo.postgisdemo.repository;

import com.kswr.spring.boot.postgis.demo.postgisdemo.model.Voivodeship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoivodeshipRepository extends JpaRepository<Voivodeship, Long> {
}
