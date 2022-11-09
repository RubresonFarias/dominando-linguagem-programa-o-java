package br.com;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("Exercício Quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("A área do quadrado é " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("A área do retângulo é " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("A área do trapézio é " + areaTrapezio);

        float areaLosango = Quadrilatero.area(10f,10f);
        System.out.println("A área do losango é " + areaLosango);

    }

}
