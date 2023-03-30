/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa2903;

/**
 *
 * @author aluno
 */
import java.util.Date;
public class Aluno extends Pessoa {
    private final int matricula;
    public Aluno(String _nome, String _cpf, Date _data, int _matricula){
        super(_nome, _cpf, _data);
        this.matricula = _matricula;  
    }
    public void getAluno(){
        System.out.println("Aluno: " + nome);
        System.out.println("Aluno: " + cpf);
        System.out.println("Aluno: " + data_nasc);
        System.out.println("Aluno: " + matricula);
    }
}

