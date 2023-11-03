import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    palabraMasLarga();
                    break;
                case 2:
                    palabraMasCorta();
                    break;
                case 3:
                    contarVocales();
                    break;
                case 0:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Palabra más larga.");
        System.out.println("2. Palabra más corta.");
        System.out.println("3. Número de vocales.");
        System.out.println("------------------------------------");
        System.out.println("0. Salir");
        System.out.print("Introduce opción: ");
    }

    public static void palabraMasLarga() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tres palabras:");
        String palabra1 = scanner.next();
        String palabra2 = scanner.next();
        String palabra3 = scanner.next();

        String masLarga = palabra1;

        if (palabra2.length() > masLarga.length()) {
            masLarga = palabra2;
        }
        if (palabra3.length() > masLarga.length()) {
            masLarga = palabra3;
        }

        System.out.println("La palabra más larga es: " + masLarga);
    }

    public static void palabraMasCorta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tres palabras:");
        String palabra1 = scanner.next();
        String palabra2 = scanner.next();
        String palabra3 = scanner.next();

        String masCorta = palabra1;

        if (palabra2.length() < masCorta.length()) {
            masCorta = palabra2;
        }
        if (palabra3.length() < masCorta.length()) {
            masCorta = palabra3;
        }

        System.out.println("La palabra más corta es: " + masCorta);
    }

    public static void contarVocales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine().toLowerCase(); // Convertir la palabra a minúsculas para contar las vocales

        int contadorVocales = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La palabra contiene " + contadorVocales + " vocal(es).");
    }
}
