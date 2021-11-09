/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 * Classe que define os métodos que serão obrigatórios nas classes DAO.
 * @author João Marcos
 */
public interface DaoGenerica<ObjetoGenerico> {
    
    /**
     * Método que deverá implementar o código para inserir dados em um tabela
     * O parâmetro deverá ser um objeto da classe específica onde será implementado esta interface.
     * Exemplo: na classe EscolaDao todas interações com o banco são referentes a tabela ESCOLA, então
     * o objeto passado como parâmetro será uma Escola
     * @param objt 
     */
    public void inserir(ObjetoGenerico objt);
    
    public void alterar(ObjetoGenerico objt);
    
    public void excluir();
    
    public ArrayList<ObjetoGenerico> consultar();
    
}
