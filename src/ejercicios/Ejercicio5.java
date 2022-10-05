package ejercicios;

import java.util.Vector;

public class Ejercicio5 {
    //Indica cuál es el problema de utilizar un
    // Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();//al tener una capacitad por defecto podemos comenzar teniendo un
        //espacio en memoria determinado por defecto
        System.out.println(v.capacity());//mostramos la capacidad asignada por defecto
        for (int i = 0; i < 1000; i++) {
            v.add((int) Math.abs(Math.random() * i + i - 1000));
        }
        System.out.println(v.capacity());//mostramos la capacidad asignada por defecto luego de completar el
        //vector con 1000 elementos
        v.trimToSize();//comprimimos la capacidad necesaria dentro de nuestra memoria
        System.out.println(v.capacity());//mostramos la capacidad necesaria luego de aplicar el método
        ///El problema que podría ocurrir es tener un espacio asignado en memoria de forma innecesaria dentro
        //dentro de nuestras aplicaciones
        //Solución: Para tener una mejor solución lo mejor es definir una capacidad sin tener cambios o usar el
        //métodos trimToSize(); lo cual ayuda a manejar el espacio en memoria.
    }
}
