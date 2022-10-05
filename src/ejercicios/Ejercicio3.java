package ejercicios;

public class Ejercicio3 {
    //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición
    // y el valor de cada elemento en ambas dimensiones.
    public static void main(String[] args) {
        int[][] matrix = {{4,9,3},{6,7,1},{8,5,2}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print("|("+i+","+j+")->["+matrix[i][j]+"]");
            }
            System.out.println();
        }
    }
}
