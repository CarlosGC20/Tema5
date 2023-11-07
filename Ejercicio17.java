import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el ancho del rectángulo: ");
        int ancho = scanner.nextInt();

        System.out.print("Introduce el alto del rectángulo: ");
        int alto = scanner.nextInt();

        System.out.print("Introduce un carácter: ");
        char caracter = scanner.next().charAt(0);

        dibujarRectangulo(ancho, alto, caracter);

        scanner.close();
    }

    public static void dibujarRectangulo(int ancho, int alto, char caracter) {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(caracter);
            }
            System.out.println(); // Salto de línea para pasar a la siguiente fila
        }
    }
}
