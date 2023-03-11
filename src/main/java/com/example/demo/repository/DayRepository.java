package com.example.demo.repository;

import com.example.demo.model.City;
import com.example.demo.model.Day;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepository extends JpaRepository<Day,String> {
}
