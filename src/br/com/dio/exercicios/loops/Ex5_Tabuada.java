package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * @author Gabriel Correia Stabile
 * Exercício: Desenvolva um gerador de tabuada capaz de
 * gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O retorno deve ser a tabuada do número informado.
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para saber a sua tabuada");
        int numeroInformado;
        numeroInformado = scan.nextInt();

        while (numeroInformado < 0 || numeroInformado > 10){
            System.out.println("Número Inválido! Digite um número entre 1 a 10");
            numeroInformado = scan.nextInt();
        }

        for (int i = 1; i <= 10; i++){
            System.out.println(numeroInformado + "x" + i + " = " + (numeroInformado * i));
        }
    }
}

