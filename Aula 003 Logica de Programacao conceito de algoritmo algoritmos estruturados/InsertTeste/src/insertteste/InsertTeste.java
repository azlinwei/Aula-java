/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertteste;
import java.util.Scanner;

/**
 *
 * @author azlin
 */
public class InsertTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a = 0;
        Scanner input = new Scanner(System.in);
	System.out.println("Informe dados: ");
	a = input.nextFloat();
	System.out.println("Informação inserida é " + a);

    }
    
}
