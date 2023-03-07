/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.firstfor;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Firstfor {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
         int i=0;
        int b=10;
        
        for (i=0; i<b; i++){
        
            System.out.printf("Meu for passou o %d.valor: \n" ,(i+1) );
            
        }
    }
}
