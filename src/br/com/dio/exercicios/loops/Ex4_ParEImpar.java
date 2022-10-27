package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * @author Gabriel Correia Stabile
 * Faça um programa que peça N números inteiros.
 * Calcule e mostre a quantidade de números ímpares e pares.
 */

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero;
        int impares = 0 , pares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) pares ++;
            else impares ++;

            count ++;

        } while(count < quantNumeros);

        System.out.println("Quantidade de números impares: " + impares);
        System.out.println("Quantidade de números pares " + pares);

    }
}
