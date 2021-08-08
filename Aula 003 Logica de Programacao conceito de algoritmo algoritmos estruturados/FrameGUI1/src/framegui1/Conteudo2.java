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
public class Conteudo2 implements Serializable
{
    private String name;
    private String sobreNome;
    private Conteudo1 conteudo1;
    private int serialNum;

    public Conteudo2(String name, String sobreNome, Conteudo1 conteudo1, int serialNum) {
        this.name = name;
        this.sobreNome = sobreNome;
        this.conteudo1 = conteudo1;
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Conteudo1 getConteudo1() {
        return conteudo1;
    }

    public void setConteudo1(Conteudo1 conteudo1) {
        this.conteudo1 = conteudo1;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }
    
    
    
}
