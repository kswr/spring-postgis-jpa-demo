package com.kswr.spring.boot.postgis.demo.postgisdemo.repository;

import com.kswr.spring.boot.postgis.demo.postgisdemo.model.Gmina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GminaRepository extends JpaRepository<Gmina, Long> {
}
