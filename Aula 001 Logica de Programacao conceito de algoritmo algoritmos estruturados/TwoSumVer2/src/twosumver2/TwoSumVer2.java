/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosumver2;

/**
 *
 * @author azlin
 */
class TwoSum {
    int[] ListNum = {10, 6, 8, 9};
    int AlvoNum = 21;
}
public class TwoSumVer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

    TwoSum Val = new TwoSum();

        if(Val.ListNum[0] + Val.ListNum[1] == Val.AlvoNum){
            System.out.print(Val.ListNum[0]+" + "+Val.ListNum[1]);
            System.out.println(" = "+Val.AlvoNum);
        }
        if(Val.ListNum[0] + Val.ListNum[2] == Val.AlvoNum){
            System.out.print(Val.ListNum[0]+" + "+Val.ListNum[2]);
            System.out.println(" = "+Val.AlvoNum);
        }
        if(Val.ListNum[0] + Val.ListNum[3] == Val.AlvoNum){
            System.out.print(Val.ListNum[0]+" + "+Val.ListNum[3]);
            System.out.println(" = "+Val.AlvoNum);
        }
        else{
            System.out.println(" Erro....");
        }
        
    }
    
}
