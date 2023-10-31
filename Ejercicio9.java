import java.util.Scanner;

public class Ejercicio9 {
    public static int calcularSumatorio(int numero) {
        int sumatorio = 0;
        for (int i = numero; i >= 1; i--) {
            sumatorio += i;
        }
        return sumatorio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        int resultado = calcularSumatorio(numero);
        System.out.println("El sumatorio de " + numero + " es: " + resultado);
        
        scanner.close();
    }
}
