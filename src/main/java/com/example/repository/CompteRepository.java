package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}