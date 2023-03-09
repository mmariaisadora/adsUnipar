/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioaula0803;

/**
 *
 * @author aluno
 */
public class Aula0803 {
    
    public static void main (String[] args) {
        cachorro cachorro1 = new cachorro();
        cachorro1.nome = "Pluto";
        cachorro1.corOlhos = "Azuis";
        cachorro1.peso = 53;
        cachorro1.quantPatas = 4;
        cachorro1.cor = "Preto";
        cachorro1.raca = "Pastor Alemão";
        cachorro1.tamanho = 60;
        
        cachorro cachorro2 = new cachorro();
        cachorro2.nome = "Rex";
        cachorro2.corOlhos = "Amarelo";
        cachorro2.peso = 22;
        cachorro2.quantPatas = 3;
        cachorro2.cor = "Marrom";
        cachorro2.raca = "Pug";
        cachorro2.tamanho = 10;
       
        cachorro cachorro3 = new cachorro();
        cachorro3.nome = "Bob";
        cachorro3.corOlhos = "marrom";
        cachorro3.peso = 13;
        cachorro3.quantPatas = 4;
        cachorro3.cor = "Caramelo";
        cachorro3.raca = "Vira-lata";
        cachorro3.tamanho = 20;
        
        cachorro cachorro4 = new cachorro();
        cachorro4.nome = "Tob";
        cachorro4.corOlhos = "Verdes";
        cachorro4.peso = 13;
        cachorro4.quantPatas = 4;
        cachorro4.cor = "Branco";
        cachorro4.raca = "Poodle";
        cachorro4.tamanho = 5;
        
        cachorro cachorro5 = new cachorro();
        cachorro5.nome = "Mel";
        cachorro5.corOlhos = "Preto";
        cachorro5.peso = 17;
        cachorro5.quantPatas = 4;
        cachorro5.cor = "Marrom";
        cachorro5.raca = "Shitzu";
        cachorro5.tamanho = 17;
        
        cachorro cachorro6 = new cachorro();
        cachorro6.nome = "Pretinho";
        cachorro6.corOlhos = "marrom";
        cachorro6.peso = 25;
        cachorro6.quantPatas = 3;
        cachorro6.cor = "Preto";
        cachorro6.raca = "PitBull";
        cachorro6.tamanho = 80;
      
        cachorro1.latir();
        cachorro2.latir();
        cachorro3.latir();
        cachorro4.latir();
        cachorro5.latir();
        cachorro6.latir();
        
    }
    
}
