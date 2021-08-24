/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarr;

import java.util.ArrayList;

/**
 *
 * @author azlin
 */
public class Dados {
    ArrayList<String> da = new ArrayList<String>();
    public String[] name = {"A1","B1","C1","D1"};
    public int[] idade = {1, 2, 3, 4};
    
    public void cadArraylist()
    {
        for(int i =0; i< name.length; i++){
        da.add(name[i]);
        da.add(Integer.toString(idade[i]));
        }  
    }
     
     public void lerArraylist()
    {
        for(int i =0; i< da.size(); i++){
            System.out.println("O valor "+ i + " da lista eh: " + da.get(i));
        } 
    }
}
