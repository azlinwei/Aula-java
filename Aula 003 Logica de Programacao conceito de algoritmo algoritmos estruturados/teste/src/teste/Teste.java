/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
import java.util.Scanner;
/**
 *
 * @author azlin
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int[] a= {1, 2, 4, 6, 8, 10};
        int alvo = 5;
        if (a[0] + a[2] ==alvo){
            System.out.print("achou resultado");
        }*/
        
        Scanner input = new Scanner(System.in);
        String str1 = "Resposta certa";
        System.out.print(str1);
        
        int a = 7;
        int b = 5;
        int alvo = 13;
        int d = input.nextInt();
        String str2 = "resposta errada";
        System.out.print(str2);
        if(a + b != d){
            System.out.print(str1);
        }else{
            System.out.print(str2);
        }
        
    }
    
}
