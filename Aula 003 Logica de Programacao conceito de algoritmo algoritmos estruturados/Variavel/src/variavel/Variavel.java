/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variavel;
/**
 *
 * @author azlin
 */
public class Variavel {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Ola mundo   ";
        String str2 = "Ola mundo \n";
        int a = 16;
        int b = 7;
        
        
        System.out.print(str1);
        System.out.println(str2);
        System.out.print(str2 + str1);
        System.out.printf("Soma das variveis a e b = %d \n", (a + b));
        System.out.printf("Subtracao das variveis a e b = %d \n", (a - b));
        System.out.printf("Multiplicacao das variveis a e b = %d \n", (a * b));
        System.out.printf("Divisao das variveis a e b = %d \n", (a / b));
        System.out.printf("Divisao das variveis a e b = %d \n", (a % b));
     
    }
    
}
