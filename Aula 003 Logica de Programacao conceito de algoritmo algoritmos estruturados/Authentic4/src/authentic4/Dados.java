/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentic4;

import java.io.*;

/**
 *
 * @author azlin
 */
public class Dados implements Serializable{
    String[] conta = {"Wei", "Lin", "Willian","Lucas","Rafael"};
    private int[] acesso = {1234, 4321, 5467, 9999, 0000};
    
    
    //private int acesso = 123456789;
    public int getAcesso0(){
        int a0 = acesso[0];
        return a0;
    }
    
    public int getAcesso1(){
        int a1 = acesso[1];
        return a1;
    }
    
    public int getAcesso2(){
        int a2 = acesso[2];
        return a2;
    }
    
    public int getAcesso3(){
        int a3 = acesso[3];
        return a3;
    }
    
    public int getAcesso4(){
        int a4 = acesso[4];
        return a4;
    }
        
}
