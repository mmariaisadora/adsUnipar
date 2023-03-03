
package com.mycompany.Aula1;
 
import java.util.Scanner;


public class aula1 {
    public static void main (String[] args) {
        
        Scanner entrada = new Scanner (System.in);  
        
        System.out.println("Informe a base do triangulo em centímetros");
        double base = entrada.nextDouble();
        
        System.out.println("Informe a altura do triângulo em centímetros");
        double alt = entrada.nextDouble();
        
        double area = ((base*alt)/2);
        
        System.out.println("A área do triângulo é: " +area+ "cm.");
        
        if (area > 10) {
            System.out.println("Hello World!");
        }
        else {
            System.out.println("...");
            
        }
        
    } 
}
