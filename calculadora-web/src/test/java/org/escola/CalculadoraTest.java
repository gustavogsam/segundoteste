package org.escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTest {
    @Test
    void deveSomarCorretamente() {
        Calculadora calc = new Calculadora();
        double resultado = calc.somar(10, 5);
        assertEquals(15, resultado);
    }

    @Test
    void subtracao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.subtrair(20, 5);
        assertEquals(15, resultado);
    }

    @Test
    void multiplicao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(5, 2);
        assertEquals(10, resultado);
    }

    @Test
    void divisao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(10, 2);
        assertEquals(5, resultado);
    }


    @Test
    void deveImpedirDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        });
    }

    @Test
    void porcento() {
        Calculadora calc = new Calculadora();
        double resultado = calc.porcetagem(100, 10);
        assertEquals(10, resultado);
    }

    @Test
    void pontenciacao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.potencia(2, 3);
        assertEquals(8, resultado);
    }

    @Test
    void raiz() {
        Calculadora calc = new Calculadora();
        double resultado = calc.raizquadrada(64);
        assertEquals(8, resultado);
    }


}