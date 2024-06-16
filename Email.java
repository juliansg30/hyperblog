package udemy;

/*
* Programa el cual genera un user de email
*/

//librerias
import java.util.Random;
import java.util.Scanner;

public class Generador_Email {

	//metodo principal
    public static void main(String[] args) {  
		//llamado al metodo
		email();
    }
	
	/*
     * @autho: Jonny Julian Sanchez gomez
     * @Descripcion: funcionalidad del metodo email
     */
    //metodo email
    static void email() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese fistName: ");
        String firstName_user = teclado.nextLine().toLowerCase();
	    System.out.println("Ingrese LastName: ");
        String lastName_user = teclado.nextLine().toLowerCase();
		System.out.println("Email asignado es: " 
		+ firstName_user + "_" + lastName_user + "@email.com.co");
	}

}