public class Ejercicio16 {

    public static void main(String[] args) {
        mostrarContadorConSustitucion();
    }

    public static void mostrarContadorConSustitucion() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        // Convierte los números a letras si son iguales al número proporcionado
                        char letraI = (i == 0) ? 'A' : (i == 1) ? 'B' : (i == 2) ? 'C' : (i == 3) ? 'D' : (i == 4) ? 'E' : (i == 5) ? 'F' : (i == 6) ? 'G' : (i == 7) ? 'H' : (i == 8) ? 'I' : (i == 9) ? 'J' : (char) (i + '0');
                        char letraJ = (j == 0) ? 'A' : (j == 1) ? 'B' : (j == 2) ? 'C' : (j == 3) ? 'D' : (j == 4) ? 'E' : (j == 5) ? 'F' : (j == 6) ? 'G' : (j == 7) ? 'H' : (j == 8) ? 'I' : (j == 9) ? 'J' : (char) (j + '0');
                        char letraK = (k == 0) ? 'A' : (k == 1) ? 'B' : (k == 2) ? 'C' : (k == 3) ? 'D' : (k == 4) ? 'E' : (k == 5) ? 'F' : (k == 6) ? 'G' : (k == 7) ? 'H' : (k == 8) ? 'I' : (k == 9) ? 'J' : (char) (k + '0');
                        char letraL = (l == 0) ? 'A' : (l == 1) ? 'B' : (l == 2) ? 'C' : (l == 3) ? 'D' : (l == 4) ? 'E' : (l == 5) ? 'F' : (l == 6) ? 'G' : (l == 7) ? 'H' : (l == 8) ? 'I' : (l == 9) ? 'J' : (char) (l + '0');

                        System.out.println(letraI + "-" + letraJ + "-" + letraK + "-" + letraL);
                    }
                }
            }
        }
    }
}
