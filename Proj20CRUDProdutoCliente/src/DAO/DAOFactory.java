/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author cralves
 */
public class DAOFactory {
    
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    private static ClienteDAO clienteDAO = new ClienteDAO();
    
    public static ProdutoDAO getProdutoDAO(){
        return produtoDAO;
    }//fecha o método
    
    public static ClienteDAO getClienteDAO(){
        return clienteDAO;
    }//fecha o método
    
}//fecha a classe DAOFactory
