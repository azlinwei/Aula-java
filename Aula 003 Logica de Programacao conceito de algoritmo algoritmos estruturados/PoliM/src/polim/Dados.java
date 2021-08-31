
package polim;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class Dados implements Function{
    ArrayList<String> da;
    private String s1;
    private int i1;

    public Dados() {
        da = new ArrayList<String>();
        
    }

    public ArrayList<String> getDa() {
        return da;
    }

    public void setDa(ArrayList<String> da) {
        this.da = da;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    
    
    
    
    @Override
    public void cadArraylist() {
        try
        {
           FileOutputStream file = new FileOutputStream("Dados.dat");
            ObjectOutputStream outputFile = new  ObjectOutputStream(file);
            for(int i = 0; i < da.size(); i++){
                outputFile.writeObject(da.get(i));            
            }
            
            JOptionPane.showMessageDialog(null, "Salvo de sucesso");
            outputFile.close();
            //this.dispose();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void lerArraylist() {
        try{
            FileInputStream file = new FileInputStream("Dados.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            boolean endOfFile = false;
            while(!endOfFile)
            {
                try{
                    da.add((String) inputFile.readObject());
                
                }catch(EOFException e){
                 endOfFile = true;
                }catch(Exception f){
                JOptionPane.showMessageDialog(null, f.getMessage());
                }
            
                }
            inputFile.close();
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    
    
}
