/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpoli;


/**
 *
 * @author azlin
 */
public class Dados {
    private String A1;
    private String A2;
    private String A3;
    private String A4;

    public Dados(String A1, String A2, String A3, String A4) {
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
        this.A4 = A4;
    }
    public boolean equals(Dados dados)
    {
        return(this.A1.equals(dados.A1) && this.A2.equals(dados.A2) && this.A3.equals(dados.A3) && this.A4.equals(dados.A4));
    }

    public String getA1() {
        return A1;
    }

    public void setA1(String A1) {
        this.A1 = A1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String A2) {
        this.A2 = A2;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String A3) {
        this.A3 = A3;
    }

    public String getA4() {
        return A4;
    }

    public void setA4(String A4) {
        this.A4 = A4;
    }
    
    
    
}
