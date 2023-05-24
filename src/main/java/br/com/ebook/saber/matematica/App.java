package br.com.ebook.saber.matematica;

public class App {

    private static double a = 3;
    private static double b = -7;
    private static double c = 2;

    private static double calcularDelta() {

        double delta = (b * b) - (4 * a * c);
        return delta;

    }

    private static void calcularBhaskara(double delta) {

        if (delta == 0) {

            double x = -b / (2 * a);
            System.out.println("X = " + x);

        }

        if (delta > 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);

        }

        if (delta < 0) {

            System.out.println("Equação não possui raízes reais.");

        }

    }

    public static void main(String[] args) {

        double delta = calcularDelta();
        calcularBhaskara(delta);

    }

}
