import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe tu peso en Kg: ");
        double peso = leer.nextDouble();

        System.out.print("Escribe tu estatura en metros: ");
        double estatura = leer.nextDouble();

        double c = peso / (estatura * estatura);

        if (c < 18.5) {
            System.out.println(c);
            System.out.println("peso bajo");
        }
        else if (c >= 18.5 && c <= 24.9) {
            System.out.println(c);
            System.out.println("peso normal");
        }
        else if (c >= 25 && c <= 26.9) {
            System.out.println(c);
            System.out.println("sobrepeso de grado 1");
        }
        else if (c >= 27 && c <= 29.9) {
            System.out.println(c);
            System.out.println("sobrepeso de grado 2");
        }
        else if (c >= 30 && c <= 34.9) {
            System.out.println(c);
            System.out.println("obesidad de tipo 1");
        }
        else if (c >= 35 && c <= 39.9) {
            System.out.println(c);
            System.out.println("obesidad de tipo 2");
        }
        else if (c >= 40 && c <= 49.9) {
            System.out.println(c);
            System.out.println("obesidad morbida");
        }
        else {
            System.out.println(c);
            System.out.println("obesidad extrema");
        }

        leer.close();
    }
}