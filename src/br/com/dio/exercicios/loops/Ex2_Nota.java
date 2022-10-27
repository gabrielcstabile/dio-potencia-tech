package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * @author Gabriel Correia Stabile
 * Exercício: Faça um programa que peça uma nota, entre 0 e 10.
 * Mostre uma mensagem de erro caso o valor seja inválido e
 * continue pedindo até que o usuário informe um valor válido.
 */

public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente");
            nota = scan.nextInt();
        }
    }
}
