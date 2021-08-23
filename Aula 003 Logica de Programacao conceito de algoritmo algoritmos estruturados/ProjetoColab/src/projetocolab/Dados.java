/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocolab;

/**
 *
 * @author azlin
 */
public class Dados {
    String[] conta = {"Wei", "Lin", "Willian","Lucas","Rafael"};
    private int[] acesso = {1234, 4321, 5467, 9999, 0000};
  
    public int getAcessoTeste(int i){
        int a = acesso[i];
        return a;
    }
}
