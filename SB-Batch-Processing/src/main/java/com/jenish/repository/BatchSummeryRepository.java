package com.jenish.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jenish.entity.BatchSummery;

public interface BatchSummeryRepository extends JpaRepository<BatchSummery, Serializable> {

}
