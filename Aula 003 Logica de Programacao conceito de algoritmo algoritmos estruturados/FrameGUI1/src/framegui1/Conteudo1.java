/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framegui1;
import java.io.*;
/**
 *
 * @author azlin
 */
public class Conteudo1 implements Serializable
{
    private double salary;
    private String nameOfJobString;

    public Conteudo1(double salary, String nameOfJobString) {
        this.salary = salary;
        this.nameOfJobString = nameOfJobString;
    }
    public boolean equals(Conteudo1 conteudo1)
    {
        return(this.salary == conteudo1.salary && 
                this.nameOfJobString.equals(conteudo1.nameOfJobString));
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameOfJobString() {
        return nameOfJobString;
    }

    public void setNameOfJobString(String nameOfJobString) {
        this.nameOfJobString = nameOfJobString;
    }
    
    
}
