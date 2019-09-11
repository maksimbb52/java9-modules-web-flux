package com.example.demo.dao;

import com.example.demo.entity.DefaultEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefaultRepository extends JpaRepository<DefaultEntity, Long> {
}
