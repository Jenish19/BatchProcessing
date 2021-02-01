package com.jenish.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jenish.entity.EligibilityDetails;

public interface EligibilityDetailsRepository extends JpaRepository<EligibilityDetails, Serializable> {

}
