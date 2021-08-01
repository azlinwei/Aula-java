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
    int[] ListNum = {5, 6, 8, 9};
    int AlvoNum = 14;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    TwoSum ValNum = new TwoSum();

        if(ValNum.ListNum[0] + ValNum.ListNum[1] == ValNum.AlvoNum){
            System.out.print(ValNum.ListNum[0]+" + "+ValNum.ListNum[1]);
            System.out.println(" = "+ValNum.AlvoNum);
        }
        if(ValNum.ListNum[0] + ValNum.ListNum[2] == ValNum.AlvoNum){
            System.out.print(ValNum.ListNum[0]+" + "+ValNum.ListNum[2]);
            System.out.println(" = "+ValNum.AlvoNum);
        }
        if(ValNum.ListNum[0] + ValNum.ListNum[3] == ValNum.AlvoNum){
            System.out.print(ValNum.ListNum[0]+" + "+ValNum.ListNum[3]);
            System.out.println(" = "+ValNum.AlvoNum);
        }
        
    }
    
}
