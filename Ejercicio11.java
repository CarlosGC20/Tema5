import java.util.Random;

public class Ejercicio11 {
    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static String generarResultadoQuiniela() {
        int resultado = generarNumeroAleatorio(1, 3);
        if (resultado == 1) {
            return "1";
        } else if (resultado == 2) {
            return "X";
        } else {
            return "2";
        }
    }

    public static void main(String[] args) {
        System.out.println("Quiniela de Fútbol (15 partidos):");
        for (int partido = 1; partido <= 15; partido++) {
            String resultado = generarResultadoQuiniela();
            System.out.println("Partido " + partido + ": " + resultado);
        }
    }
}
