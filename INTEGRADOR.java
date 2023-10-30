import java.util.*;
import java.lang.Math;

class Program {

    public static void main(String[] args) {
        int teclado;
        double sueldo;

        sueldo = 0;
        int categoria;

        System.out.println("ingresar el tipo de categoría ");

        Scanner teclado =  Scanner(System.in);
        categoria = teclado;
        if (categoria == 1) {
            sueldo = 500 + 500 * 0.1;
        } else {
            if (categoria == 2) {
                sueldo = 450 + 450 * 0.1;
            } else {
                if (categoria == 3) {
                    sueldo = 600 + 600 * 0.1;
                } else {
                    System.out.println("ingresar el número establecido para categorias");
                }
            }
        }
        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("El total del sueldo de la categoria " + categoria + " es igual a " + sueldo);
        }
    }
}
