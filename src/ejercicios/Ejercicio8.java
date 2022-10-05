package ejercicios;

public class Ejercicio8 {
    //Crea una función DividePorCero.
    // Esta, debe generar una excepción ("throws") a su llamante del tipo
    // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
    // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    // Finalmente, mostraremos en cualquier caso: "Demo de código".
    public static void main(String[] args) {
        System.out.println(dividePorCero(10,2));
    }
    public static int dividePorCero(int a,int b) throws ArithmeticException{
        try
        {
            System.out.print("Demo de codigo: ");
        return a/b;
        }catch(ArithmeticException e){
            throw new ArithmeticException("Esto no puede hacerse");
        }
    }
}
