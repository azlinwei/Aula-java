/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesave;

import java.io.*;

/**
 *
 * @author azlin
 */
public class TesteSave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data dado = new Data();
        dado.name = "Wei";
        dado.idade = 32;
        
        String fileName = "data.dat";
        
        try {
            ObjectOutputStream outPut = new ObjectOutputStream(new FileOutputStream(fileName));
            outPut.writeObject(dado);
            outPut.close();
        } catch (FileNotFoundException e) {
            
        }catch (IOException e) {
            
        }
        
        try {
            ObjectInputStream inPut = new ObjectInputStream(new FileInputStream(fileName));
            Data d = (Data) inPut.readObject();
            System.out.println("Recebendo dados: " + d.name + " with age: " + d.idade);
            inPut.close();
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
    }
    
}
