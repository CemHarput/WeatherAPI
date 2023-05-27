package com.example.demo.repository;

import com.example.demo.model.CurrentCondition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentConditionRepository extends JpaRepository<CurrentCondition,String> {
}
