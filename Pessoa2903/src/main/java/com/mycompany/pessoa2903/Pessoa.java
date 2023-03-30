/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa2903;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Pessoa {
    public String nome;
    public String cpf;
    public Date data_nasc;
    
    public Pessoa(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nasc = _data;
        
    }
    
    public void getPessoa(){
        System.out.println("Nome da Pessoa: " + nome);
        System.out.println("Nome da Pessoa: " + cpf);
        System.out.println("Nome da Pessoa: " + data_nasc);
    }
}
