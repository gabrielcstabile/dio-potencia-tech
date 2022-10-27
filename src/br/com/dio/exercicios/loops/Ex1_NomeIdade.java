package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * @author Gabriel Correia Stabile
 * Exercício: Faça um programa que leia um conjunto de dois valores,
 * o primeiro representando o seu nome, e o segundo a sua idade.
 * Pare o programa quando 0 for inserido no campo nome.
 */

public class Ex1_NomeIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
    }
}
