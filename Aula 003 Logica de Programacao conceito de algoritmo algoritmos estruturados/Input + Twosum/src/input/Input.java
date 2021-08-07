/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.util.Scanner;

/**
 *
 * @author azlin
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Informe o valor da base");
        base = input.nextDouble();
        System.out.println("Informe o valor da altura");
        altura = input.nextDouble();
        
        area = base * altura;
        System.out.println("A area eh igual a:  " + area);
        
        
    }
    
}
