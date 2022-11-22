package br.com.dio.exercicios.desafio;

import java.util.*;

/**
 * @author Gabriel Correia Stabile
 * Desafio: Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.
 */

public class D3_Recursividade {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int N;

        N = numero.nextInt();
        System.out.println(somatorio(N));
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}