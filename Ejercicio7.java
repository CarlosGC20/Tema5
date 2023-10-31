public class Ejercicio7 {
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

    public static void main(String[] args) {
        int numero = 5; // Puedes cambiar el número aquí
        long resultado = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
