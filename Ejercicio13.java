public class Ejercicio13 {
    public static void saludar(String nombre, char idioma) {
        String mensaje = "";

        switch (idioma) {
            case 'a':
                mensaje = "Buenos días " + nombre;
                break;
            case 'b':
                mensaje = "Buenos días " + nombre;
                break;
            case 'c':
                mensaje = "Good morning " + nombre;
                break;
            default:
                mensaje = "Idioma no válido";
                break;
        }

        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        String nombre = "Pepe";
        char idioma = 'a'; // Cambia el código del idioma según tus preferencias

        saludar(nombre, idioma);
    }
}
