public class Ejercicio8 {
    public static boolean esCapicua(int digito1, int digito2, int digito3, int digito4) {
        // Comprueba si la secuencia de números es capicúa
        return (digito1 == digito4) && (digito2 == digito3);
    }

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 2;
        int numero4 = 1;

        if (esCapicua(numero1, numero2, numero3, numero4)) {
            System.out.println("La secuencia es capicúa.");
        } else {
            System.out.println("La secuencia no es capicúa.");
        }
    }
}
