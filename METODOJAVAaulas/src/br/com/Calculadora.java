package br.com;

public class Calculadora {

    public static void soma (double a, double b) {

        double resultado = a + b;

        System.out.println("A soma de " + a + " e " + b + " é igual a " + resultado);

    }

    public static void subtracao (double a, double b) {

        double resultado = a - b;

        System.out.println("A diferença entre " + a + " e " + b + " é " + resultado);

    }

    public static void multiplicacao (double a, double b) {

        double resultado = a * b;

        System.out.println("A multiplicação entre " + a + " e " + b + " é " + resultado);

    }

    public static void divisao (double a, double b) {

        double resultado = a / b;

        System.out.println("A divisão entre " + a + " e " + b + " é " + resultado);

    }

}
