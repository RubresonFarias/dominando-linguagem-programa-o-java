package br.com;

import java.util.Scanner;

public class AtividadeMetodos {

    public static void main(String[] args) {

        double a, b;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("Informe o primeiro número: ");
        a = entrada.nextDouble();
        System.out.println("Informe o segundo número: ");
        b = entrada.nextDouble();

        Calculadora.soma(a, b);
        Calculadora.subtracao(a, b);
        Calculadora.multiplicacao(a, b);
        Calculadora.divisao(a, b);

        int hora;

        System.out.println("Mensagem");
        System.out.println("Informe a hora: ");
        hora = entrada.nextInt();

        Mensagem.obterMensagem(hora);

        double valor;
        int parcelas;

        System.out.println("Exercício empréstimo");
        System.out.println("Informe o valor do empréstimo:");
        valor = entrada.nextDouble();
        System.out.println("Informe o valor das parcelas:");
        parcelas = entrada.nextInt();

        Emprestimo.calcular(valor, Emprestimo.getParcelas(parcelas));

    }

}
