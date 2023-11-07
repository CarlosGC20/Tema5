import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu NIF (sin letra): ");
        int numeroDNI = scanner.nextInt();

        System.out.print("Introduce la letra del NIF: ");
        char letraUsuario = scanner.next().charAt(0);

        char letraCalculada = calcularLetraNIF(numeroDNI);

        if (letraUsuario == letraCalculada) {
            System.out.println("El NIF introducido es correcto.");
        } else {
            System.out.println("El NIF introducido es incorrecto.");
        }

        scanner.close();
    }

    public static char calcularLetraNIF(int numeroDNI) {
        // Array de letras para el NIF
        String letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";

        // Calcular la letra del NIF
        int resto = numeroDNI % 23;
        return letrasNIF.charAt(resto);
    }
}
