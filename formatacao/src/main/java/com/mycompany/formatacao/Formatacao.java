/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.formatacao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Formatacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o primeiro valor: ");
        int  a = entrada.nextInt();
       
        System.out.println("Informe o segundo valor: ");
        int b = entrada.nextInt();
        
        System.out.printf("\nResultados:\n");
        System.out.printf("%d + %d = %3d\n", a, b, (a+b));
        System.out.printf("%d - %d = %3d\n", a, b, (a-b));
        System.out.printf("%d * %d = %3d\n", a, b, (a*b));
        System.out.printf("%d / %d = %3d (divisão inteira)\n", a, b, (a/b));
        System.out.printf("%d / %d = %6.2f (divisão exata)\n", a, b,((double) a/b));
        
    }
}
