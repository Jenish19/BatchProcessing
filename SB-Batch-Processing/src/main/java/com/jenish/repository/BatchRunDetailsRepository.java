package com.jenish.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jenish.entity.BatchRunDetails;

public interface BatchRunDetailsRepository extends JpaRepository<BatchRunDetails, Serializable> {

}
