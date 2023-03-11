package com.example.demo.repository;

import com.example.demo.model.City;
import com.example.demo.model.StationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationEntityRepository extends JpaRepository<StationEntity,String> {
}
