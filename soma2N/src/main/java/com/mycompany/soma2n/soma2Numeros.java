/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soma2n;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class soma2Numeros {

    public static void main(String[] args) {
          Scanner entrada = new Scanner (System.in);  
          
        System.out.println("Informe o primeiro número: ");
        double primeiro = entrada.nextDouble();
        
        System.out.println("Informe o segundo número: ");
        double segundo = entrada.nextDouble();
        
        double soma = (primeiro + segundo);
        System.out.println("A soma dos números é: " +soma);
   
        
    }
}
