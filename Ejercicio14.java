import java.util.Scanner;

public class Ejercicio14 {
    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long coeficienteBinomial(int n, int m) {
        if (n < m) {
            return 0; // n sobre m es 0 si n es menor que m
        }

        long numerador = calcularFactorial(n);
        long denominador = calcularFactorial(m) * calcularFactorial(n - m);

        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Introduce el valor de m: ");
        int m = scanner.nextInt();

        long resultado = coeficienteBinomial(n, m);
        System.out.println("El coeficiente binomial (" + n + " sobre " + m + ") es: " + resultado);

        scanner.close();
    }
}
