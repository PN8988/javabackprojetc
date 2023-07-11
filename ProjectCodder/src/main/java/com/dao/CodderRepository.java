package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Codder;

public interface CodderRepository extends JpaRepository<Codder,Integer> {

}
