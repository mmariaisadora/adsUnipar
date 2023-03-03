/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aluno;
import java.util.Scanner;

public class aluno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Informe o nome do usuário: ");
        String nome = entrada.nextLine();
        
        System.out.println("Informe o sexo do usuário: ");
        char sexo = entrada.next().charAt(0); 
        
        System.out.println("O sexo é: ");
        
        switch (sexo) {
            case 'f' -> System.out.println("Feminino");
            case 'm' -> System.out.println("Masculino");
            case 'g' -> System.out.println("Gay");
            case 'l' -> System.out.println("Lésbica");
            default -> System.out.println("Programador");
        }
    }
}
