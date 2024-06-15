package udemy;

/*
* Programa el cual genera un user de email
*/

import java.util.Random;
import java.util.Scanner;

public class Generador_Email {

    public static void main(String[] args) {
        
        
    }
	
	/*
     * @autho: Jonny Julian Sanchez gomez
     * @Descripcion: funcionalidad del metodo email
     */
    static void email() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Nombres: ");
        String firstName_user = teclado.nextLine().toLowerCase();
	    System.out.println("Ingrese Apellido: ");
        String lastName_user = teclado.nextLine().toLowerCase();
	}
}