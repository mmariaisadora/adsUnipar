/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculoareacirculo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class CalculoAreaCirculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
         System.out.println("Vamos calcular a área de um circulo. ");
       
        System.out.println("Informe o raio dessa circunferência: ");
        double raio = entrada.nextDouble();
        
        double areacirc = (raio*raio* 3.14);
        
        System.out.print("A área do círculo é: ");
        System.out.printf("%.02f", areacirc);
        
   
    }
}