package org.escola;

import java.util.ArrayList;

public class Calculadora {

    public static class Historico {

        double pri;
        double sen;
        double res;

        public Historico (double pri, double sen, double res) {
            this.pri = pri;
            this.sen = sen;
            this.res = res;
        }
    }


    Historico[] calhistorico = new Historico[10];

    public double somar(double a, double b) {
        return a + b;

    }



    public double subtrair(double a, double b) {
        return a - b;


    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }

    public double porcetagem(double a, double b) {
        return a * b / 100;

    }

    public double potencia(double a, double b) {

        return Math.pow( a, b);
    }

    public double raizquadrada(double a) {

        return Math.sqrt(a);
    }


}