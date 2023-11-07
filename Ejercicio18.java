import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int dni = solicitarDNI();
        String nif = calcularNIF(dni);
        System.out.println("El NIF completo es: " + nif);
    }

    public static int solicitarDNI() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu número de DNI: ");
        int dni = scanner.nextInt();
        scanner.close();
        return dni;
    }

    public static String calcularNIF(int dni) {
        // Array de letras para el NIF
        String letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";

        // Calcular la letra del NIF
        int resto = dni % 23;
        char letraNIF = letrasNIF.charAt(resto);

        // Convertir el DNI y la letra en un String
        String nifCompleto = String.valueOf(dni) + letraNIF;

        return nifCompleto;
    }
}
