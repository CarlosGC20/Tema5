import java.util.Scanner;

public class Ejercicio10 {
    public static void imprimirTablaDeMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Introduce un número entero (negativo para salir): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                imprimirTablaDeMultiplicar(numero);
            }
        } while (numero >= 0);

        scanner.close();
    }
}
