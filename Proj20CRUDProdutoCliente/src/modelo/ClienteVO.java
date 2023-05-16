/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cralves
 */
public class ClienteVO {
    
    
    //Atributos da Classe
    private String nome;
    private String endereco;
    private long cpf;
    private String dtNasc;
    private String fone;
    private String email;
    private long codCli;

    public long getCodCli() {
        return codCli;
    }

    public void setCodCli(long codCli) {
        this.codCli = codCli;
    }
      
    
    //Métodos Acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }
        
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
            
}//fim da ClienteVO
