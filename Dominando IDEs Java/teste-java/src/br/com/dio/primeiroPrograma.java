package br.com.dio;

import java.util.Scanner;

public class primeiroPrograma {

    public static void main(String[] args) {

        Scanner entraDado = new Scanner(System.in);

        String nome;

        System.out.println("Informe o seu nome");
        nome = entraDado.nextLine();

        System.out.println("Olá " + nome + ", o mais novo DEV!");
        System.out.println("Bem-vindo ao mundo T.I");

    }

}
