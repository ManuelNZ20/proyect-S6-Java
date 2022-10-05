package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
    // Por último, vuelve a recorrerlo y muestra el ArrayList final.
    // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
        for(int i=2;i<11;i+=2){
            list.add(i);
        }
        System.out.print("Lista final: ");
        list.forEach(i->{
            System.out.print(i+", ");
        });
    }
}
