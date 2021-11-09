/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import modelo.Escola;

/**
 *
 * @author João Marcos
 */
public class EscolaDao implements DaoGenerica<Escola>{

    private ConexaoBanco conexao;
    
    public EscolaDao()
    {
        this.conexao = new ConexaoBanco();
    }
    
    @Override
    public void inserir(Escola escola) {
        //string com a consulta que será executada no banco
        String sql = "INSERT INTO ESCOLA (NOME, RUA, NUMERO, CEP, BAIRRO, TELEFONE, DIRETOR) VALUES (?,?,?,?,?,?,?)";
        
        try
        {
            //tenta realizar a conexão, se retornar verdadeiro entra no IF
            if(this.conexao.conectar())
            {
                //prepara a sentença com a consulta da string
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //subtitui as interrograções da consulta, pelo valor específico
                sentenca.setString(1,escola.getNome()); //subsitui a primeira ocorrência da interrogação pelo atributo nome
                sentenca.setString(2,escola.getRua());
                sentenca.setInt(3,escola.getNumero()); //subsitui a terceira ocorrência da interrogação pelo atributo número
                sentenca.setString(4,escola.getCEP());
                sentenca.setString(5,escola.getBairro());
                sentenca.setString(6,escola.getTelefone());
                sentenca.setString(7,escola.getDiretor());
                
                sentenca.execute(); //executa o comando no banco
                sentenca.close(); //fecha a sentença
                this.conexao.getConnection().close(); //fecha a conexão com o banco
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(Escola escola) {
        String sql = "UPDATE ESCOLA SET NOME = ?, RUA = ?, NUMERO = ?, CEP = ?, BAIRRO = ?, TELEFONE = ?, DIRETOR = ? WHERE IDESCOLA = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1,escola.getNome());
                sentenca.setString(2,escola.getRua());
                sentenca.setInt(3,escola.getNumero());
                sentenca.setString(4,escola.getCEP());
                sentenca.setString(5,escola.getBairro());
                sentenca.setString(6,escola.getTelefone());
                sentenca.setString(7,escola.getDiretor());
                sentenca.setInt(8,escola.getIdEscola());
                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void excluir() {
        String sql = "DELETE FROM ESCOLA";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
   
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    
    public void excluirID(int id) {
        String sql = "DELETE FROM ESCOLA WHERE IDESCOLA = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setInt(1, id);
                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public ArrayList<Escola> consultar() {
        
        ArrayList<Escola> listaEscolas = new ArrayList<Escola>();
        String sql = "SELECT * FROM ESCOLA ORDER BY IDESCOLA";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //recebe o resultado da consulta
                ResultSet resultadoSentenca = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while(resultadoSentenca.next()) 
                {
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela Escola
                    Escola escola = new Escola();
                    escola.setIdEscola(resultadoSentenca.getInt("IDESCOLA"));
                    escola.setNome(resultadoSentenca.getString("NOME"));
                    escola.setRua(resultadoSentenca.getString("RUA"));
                    escola.setNumero(resultadoSentenca.getInt("NUMERO"));
                    escola.setCEP(resultadoSentenca.getString("CEP"));
                    escola.setBairro(resultadoSentenca.getString("BAIRRO"));
                    escola.setTelefone(resultadoSentenca.getString("TELEFONE"));
                    escola.setDiretor(resultadoSentenca.getString("DIRETOR"));
                   
                    //adiciona cada tupla na listaEscolas que será retornada para a janela Escola
                    listaEscolas.add(escola);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listaEscolas;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

}
