package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * @author Gabriel Correia Stabile
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
 */

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1;

        System.out.println("Digite um número: ");
        fatorial = scan.nextInt();

        System.out.print(fatorial + "! = ");
        for(int i = fatorial; i >= 1; i --){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
