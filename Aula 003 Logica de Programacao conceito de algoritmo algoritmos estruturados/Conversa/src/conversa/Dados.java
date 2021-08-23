/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversa;
import java.io.*;
/**
 *
 * @author azlin
 */
public class Dados implements Serializable{
    public String[] mL1 = new String[20];
    public String[] mL2 = new String[20];
    public String mL3;
    public String Temp;
    
    public ObjectOutputStream inDat;
    public ObjectInputStream ouDat;
       
}
