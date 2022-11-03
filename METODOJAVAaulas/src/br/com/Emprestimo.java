package br.com;

public class Emprestimo {

    public static int getParcelas(int parcelas) {

        return parcelas;
    }
    public static double getTaxaDuasParcelas() {

        return 0.3;
    }
    public static double getTaxaCincoParcelas() {

        return 0.45;
    }
    public static void calcular(double valor, int parcelas) {

        if (parcelas <= 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para " + getParcelas(parcelas) + " parcelas: R$ " + valorFinal);

        } else if ((parcelas > 2) || (parcelas <= 5)) {

            double valorFinal = valor + (valor * getTaxaCincoParcelas());

            System.out.println("Valor final do empréstimo para " + getParcelas(parcelas) + " parcelas: R$ " + valorFinal);

        } else {

            System.out.println("Quantidade de parcelas não aceita.");

        }
    }
}

