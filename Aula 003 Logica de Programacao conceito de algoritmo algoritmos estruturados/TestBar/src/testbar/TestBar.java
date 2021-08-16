/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbar;
        
/**
 *
 * @author azlin
 */
public class TestBar {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loading lo = new Loading();
        lo.setVisible(true);
        
        try {
                for(int i = 0; i <= 100; i++){
                Thread.sleep(50);
                Loading.jLabel2.setText(Integer.toString(i)+"%");
                Loading.jProgressBar1.setValue(i);  
                }
             
                for(int i = 100; i >= 0; i--){
                Thread.sleep(50);
                Loading.jLabel2.setText(Integer.toString(i)+"%");
                Loading.jProgressBar1.setValue(i);  
                }
            } catch(Exception e){
        }
    }
}
