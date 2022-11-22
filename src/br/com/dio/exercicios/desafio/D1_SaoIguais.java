package br.com.dio.exercicios.desafio;

import java.util.Scanner;

/**
 * @author Gabriel Correia Stabile
 * Nesse desafio, dados dois números, verifique se eles são iguais.
 * Caso sejam, retorne "São iguais". Caso não sejam, retorne "Não são iguais".
 */

public class D1_SaoIguais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 0, b = 0;

        System.out.print("Digite o primeiro número: ");
        a = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        b = scan.nextInt();

        if(a == b) System.out.println("\nSão iguais");
        else System.out.println("\nNão são iguais");

    }
}
