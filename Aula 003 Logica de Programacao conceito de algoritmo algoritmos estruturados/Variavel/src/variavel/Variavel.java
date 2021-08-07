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
        //String str1 = "Ola mundo   ";
        //String str2 = "Ola mundo \n";
        int[] a = {1, 2, 5, 6, 7, 9};
        int b;
        int alvo;
        //int c;
        //c=a[4];
        b = 16;
        alvo = 23;
        
        int val1 = 2;
        int val2 = 2;
        
        int val3 = 2;
        int val4 = 2;
        
        String str1 = "True...";
        String str2 = "False...";
        
        if(val1 + val2 == val3 * val4){
            System.out.print(str1);
        }else{
            System.out.print(str2);
        }
        
        if(a[4] + b == alvo){
            System.out.print("Resposta correta...");
        }else{
            System.out.print("Resposta errada...");
        }
        
        System.out.print(str1);
        System.out.println(str2);
        System.out.print(str2 + str1);
        /*System.out.printf("Soma das variveis a e b = %d \n", (a + b));
        System.out.printf("Subtracao das variveis a e b = %d \n", (a - b));
        System.out.printf("Multiplicacao das variveis a e b = %d \n", (a * b));
        System.out.printf("Divisao das variveis a e b = %d \n", (a / b));
        System.out.printf("Divisao das variveis a e b = %d \n", (a % b));*/
     
    }
    
}
