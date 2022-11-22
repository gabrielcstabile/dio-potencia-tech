package br.com.dio.exercicios.desafio;

import java.util.Scanner;

public class D6_ChegagemPalindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        String novaPalavra = "";
        String[] letras = palavra.split("");
        for (int i = letras.length - 1; i >= 0; i--) {
            novaPalavra = novaPalavra + letras[i];
        }
        System.out.println(novaPalavra.equals(palavra) ? "TRUE" : "FALSE");
    }
}
