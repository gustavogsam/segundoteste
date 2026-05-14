package org.escola.service;

import org.escola.model.Calculadora;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double calcular(Calculadora calculadora) {
        String operacao = calculadora.getOperacao();
        if (operacao == null || operacao.isBlank()) {
            throw new IllegalArgumentException("Operação inválida");
        }

        return switch (operacao.toLowerCase()) {

            case "somar" -> calculadora.somar(
                    parseNumber(calculadora.getNumero1()),
                    parseNumber(calculadora.getNumero2())
            );

            case "subtrair" -> calculadora.subtrair(
                    parseNumber(calculadora.getNumero1()),
                    parseNumber(calculadora.getNumero2())
            );

            case "multiplicar" -> calculadora.multiplicar(
                    parseNumber(calculadora.getNumero1()),
                    parseNumber(calculadora.getNumero2())
            );

            case "dividir" -> calculadora.dividir(
                    parseNumber(calculadora.getNumero1()),
                    parseNumber(calculadora.getNumero2())
            );

            case "potencia" -> calculadora.potencia(
                    parseNumber(calculadora.getNumero1()),
                    parseNumber(calculadora.getNumero2())
            );

            case "porcentagem" -> calculadora.porcentagem(
                    parseNumber(calculadora.getNumero1()),
                    parseNumber(calculadora.getNumero2())
            );

            case "raiz" -> calculadora.raizQuadrada(
                    parseNumber(calculadora.getNumero1())
            );

            default -> throw new IllegalArgumentException("Operação inválida");
        };
    }

    private double parseNumber(String valor) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("Entrada inválida");
        }

        try {
            return Double.parseDouble(valor.replace(',', '.').trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Entrada inválida");
        }
    }
}