package ejercicios;

public class Ejercicio2 {
    //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static void main(String[] args) {
        String[] nombres = {"First","Second","Third","Fourth","fifth","sixth","eighth"};
        for(String n:nombres){
            System.out.print(n+", ");
        }
    }
}
