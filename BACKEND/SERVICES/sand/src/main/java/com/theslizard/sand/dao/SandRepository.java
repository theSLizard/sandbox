package com.theslizard.sand.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theslizard.sand.persistence.Journal;

@Repository	
public interface SandRepository extends JpaRepository<Journal, Long>{

}
