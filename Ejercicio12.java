import java.util.Random;

public class Ejercicio12 {
    public static String calcularEquivalenteAlfabético(double nota) {
        if (nota < 0 || nota > 10) {
            return "Nota fuera de rango";
        } else if (nota < 5) {
            return "INSUFICIENTE";
        } else if (nota < 6) {
            return "SUFICIENTE";
        } else if (nota < 7) {
            return "BIEN";
        } else if (nota < 9) {
            return "NOTABLE";
        } else {
            return "EXCELENTE";
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 50; i++) {
            double nota = random.nextDouble() * 10; // Genera una nota aleatoria entre 0 y 10
            String equivalente = calcularEquivalenteAlfabético(nota);
            System.out.println("Calificación #" + i + ": " + nota + " - " + equivalente);
        }
    }
}
