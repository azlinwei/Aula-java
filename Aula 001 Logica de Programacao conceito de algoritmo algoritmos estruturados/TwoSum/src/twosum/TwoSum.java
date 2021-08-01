/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosum;

/**
 *
 * @author azlin
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] ListNum = {10, 6, 8, 9};
    int AlvoNum = 21;

    //TwoSum ValNum = new TwoSum();

        if(ListNum[0] + ListNum[1] == AlvoNum){
            System.out.print(ListNum[0]+" + "+ListNum[1]);
            System.out.println(" = "+AlvoNum);
        }
        if(ListNum[0] + ListNum[2] == AlvoNum){
            System.out.print(ListNum[0]+" + "+ListNum[2]);
            System.out.println(" = "+AlvoNum);
        }
        if(ListNum[0] + ListNum[3] == AlvoNum){
            System.out.print(ListNum[0]+" + "+ListNum[3]);
            System.out.println(" = "+AlvoNum);
        }
        else{
            System.out.println(" Erro....");
        }
        
    }
    
}
