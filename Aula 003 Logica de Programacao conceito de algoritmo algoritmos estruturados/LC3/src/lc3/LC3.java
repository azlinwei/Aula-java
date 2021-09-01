/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lc3;
import java.util.*;

/**
 *
 * @author azlin
 */
public class LC3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "";
        String c = "";
        String Temp = "";
        int cont = 0;
        Scanner input = new Scanner(System.in);
	System.out.println("Informe dados: ");
	a = input.nextLine();
        char[] b = new char[a.length()];
        for(int i = 0; i<a.length(); i++){
            b[i] = a.charAt(i);        
        }
	System.out.println("Informação inserida é " + Arrays.toString(b));
        
        for (int i = 0; i < a.length(); i++) {
            c = Character.toString(b[i]);
            for (int j = 0; j < a.length(); j++) {
                Temp = Character.toString(b[j]);
                if (Temp.equals(c)) {
                    
                    
                }
            }
        
    }
        System.out.println("Informação inserida sem rep é " + cont);
    
    }
}
