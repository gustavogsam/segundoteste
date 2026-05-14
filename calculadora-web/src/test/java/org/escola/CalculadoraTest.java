package org.escola;

import static org.junit.jupiter.api.Assertions.*;

import org.escola.model.Calculadora;
import org.escola.service.CalculadoraService;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void deveSomarCorretamente() {
        Calculadora calc = new Calculadora();
        double resultado = calc.somar(5, 5);
        assertEquals(10, resultado);
    }

    @Test
    void subtracao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.subtrair(10, 2);
        assertEquals(8, resultado);
    }

    @Test
    void multiplicao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(2, 5);
        assertEquals(10, resultado);
    }

    @Test
    void divisao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(20, 4);
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
    void entradaInvalidaDeveLancarExcecao() {
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1("abc");
        calculadora.setNumero2("5");
        calculadora.setOperacao("somar");

        CalculadoraService service = new CalculadoraService();

        assertThrows(IllegalArgumentException.class, () -> service.calcular(calculadora));
    }

  

    @Test
    void numeronegativo() {
        Calculadora calc = new Calculadora();
        double resultado = calc.somar(-5, 2);
        assertEquals(-3, resultado);
    }

    @Test
    void numeroquebrado() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(2.5, 2);
        assertEquals(5.0, resultado);
    }



  


}