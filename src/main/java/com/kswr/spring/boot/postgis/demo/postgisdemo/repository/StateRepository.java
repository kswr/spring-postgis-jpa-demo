package com.kswr.spring.boot.postgis.demo.postgisdemo.repository;

import com.kswr.spring.boot.postgis.demo.postgisdemo.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
