/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarr;

import java.util.Arrays;




/**
 *
 * @author azlin
 */
public class ListArr {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       //a.cadArraylist();
       //a.lerArraylist();
       Dados a = new Dados();
       System.out.println(a.getName());
       System.out.println(Arrays.toString(a.getIdade()));
       System.out.println(Arrays.toString(a.getName()));
       String[] back =a.getName();
       System.out.println(back[0]);
       back[0] = "Q1";
       a.setName(back);
       System.out.println(Arrays.toString(a.getName()));
       int[] after =a.getIdade();
        after[0] = 123456789;
        a.setIdade(after);
        System.out.println(Arrays.toString(a.getIdade()));
       
    }
    
     

    
}
