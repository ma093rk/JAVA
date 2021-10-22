import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Condicions {
    public static void main(String[] args) throws Exception {
        String nom;
        int nombreLlegit;

        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra el teu nom: ");
        nom = teclat.next();
        System.out.print("Hola " + nom + " entra un nombre: ");
        nombreLlegit = teclat.nextInt();
        if(nombreLlegit < 0) {    // Si es negatiu
            System.out.print("Has entrat un nombre negatiu!");    
        } else {                  // Si no es negatiu
            System.out.print("Has entrat un nombre positiu o zero!");     
        }

        teclat.close();

        

    }
}
