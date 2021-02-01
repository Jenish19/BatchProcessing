package com.jenish.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jenish.entity.CoTriggers;

public interface CoTriggerRepository extends JpaRepository<CoTriggers, Serializable> {

}
