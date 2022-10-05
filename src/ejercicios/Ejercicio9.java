package ejercicios;

import java.io.*;

public class Ejercicio9 {
    // Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
    // "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero
    // dado en el parámetro "fileIn" al fichero dado en "fileOut".
    public static void main(String[] args) {
        try
        {
            InputStream fileIn = new FileInputStream("fileIn.txt");
            PrintStream fileOut = new PrintStream("fileOut.txt");
            fileInANDOut(fileIn,fileOut);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void fileInANDOut(InputStream fileIn, PrintStream fileOut){
        try {
            byte[] datos = fileIn.readAllBytes();
            fileOut.write(datos);
            fileOut.write(13);
        }catch (IOException e) {
            throw new RuntimeException("Error de lectura: "+e.getMessage());
        }
    }
}
