public class Ejercicio6 {
    public static void main(String[] args) {
        char caracter = 'a';
        int vecesEnLinea = 5;
        int lineas = 3;

        imprimirCaracteres(caracter, vecesEnLinea, lineas);
    }

    public static void imprimirCaracteres(char c, int vecesEnLinea, int numLineas) {
        for (int i = 0; i < numLineas; i++) {
            for (int j = 0; j < vecesEnLinea; j++) {
                System.out.print(c);
            }
            System.out.println(); // Agrega un salto de línea al final de cada línea
        }
    }
}
