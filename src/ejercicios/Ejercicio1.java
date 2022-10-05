package ejercicios;

public class Ejercicio1 {
    /*
    * Dada la función:
    *  public static String reverse(String texto) { }
    * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    * */
    public static void main(String[] args) {
        System.out.println(reverse("hola mundo"));
    }
    public static String reverse(String texto){
        String r = "";
        for(char c:texto.toCharArray()){
            r = c + r;
        }
        return r;
    }
}
