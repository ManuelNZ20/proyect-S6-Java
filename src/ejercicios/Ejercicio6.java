package ejercicios;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio6 {
    //Crea un ArrayList de tipo String, con 4 elementos.
    // Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Forth");
        arrayList.forEach(i->{
           linkedList.add(i);
        });
        System.out.print("\nElement ArrayList: ");
        arrayList.forEach(i->{
            System.out.print(i+" ");
        });
        System.out.print("\nElement LinkedList: ");
        linkedList.forEach(i->{
            System.out.print(i+" ");
        });

    }
}
