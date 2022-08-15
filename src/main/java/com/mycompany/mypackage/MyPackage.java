/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mypackage;

import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class MyPackage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o valor a ser multiplicado");
            int value = scanner.nextInt();
            System.out.println("Quantas vezes deve ser multiplicado");
            int value2 = scanner.nextInt();
            int contador = 0;
            System.out.println(" --- ---- ---- ----");

            for(int index = 0; index <= value2; index = index + 1){
                   contador   =  value * index;
                   System.out.println(value + " * " +  index + " = " +  contador);
            }
            
        } catch (Exception e) {
            
            System.out.println("Você digitou um valor inválido");
            System.out.println("Só aceita valores inteiros");
        }
        
        scanner.close();
    }
}