package com.jenish.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jenish.entity.CoPdfs;

public interface CoPdfsRepository extends JpaRepository<CoPdfs, Serializable> {

}
