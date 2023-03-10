package tema3;

public class tema3 {

    public static void main(String[] args) {
        String[] nombres = {"Juan", "María", "Pedro", "Ana"};

        String resultado = ""; // Variable que almacenará el resultado final de la concatenación

        for (int i = 0; i < nombres.length; i++) {
            resultado += nombres[i] + " "; // Concatenamos cada nombre al resultado final, separado por un espacio en blanco
        }

        System.out.println(resultado); // Imprimimos el resultado final por consola

    }
}
