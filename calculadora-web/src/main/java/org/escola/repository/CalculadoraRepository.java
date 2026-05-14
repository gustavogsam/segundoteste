package org.escola.repository;

import org.escola.model.Calculadora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculadoraRepository extends JpaRepository<Calculadora, Long> {
}