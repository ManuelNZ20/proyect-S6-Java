package ejercicios;

import java.util.Vector;

public class Ejercicio4 {
    //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
    // Elimina el 2o y 3er elemento y muestra el resultado final.
    public static void main(String[] args) {
        Vector<String> vNombres = new Vector<>();
        vNombres.add("First");
        vNombres.add("Second");
        vNombres.add("Third");
        vNombres.add("Fourth");
        vNombres.add("Fifth");
        System.out.println("Lista original de nombres: ");
        vNombres.forEach((i) -> {
            System.out.print(i+" ");
        });
        vNombres.remove(1);//eliminación del segundo nombre
        vNombres.remove(1);//eliminación del tercer nombre
        System.out.println("\nNueva lista de nombres");
        vNombres.forEach(i->{
            System.out.print(i+" ");
        });
    }
}
