package br.com.dio.exercicios.desafio;

import java.util.*;

public class D5_BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero, pos = -1;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        numero = leitor.nextInt();
        pos = posicao(numero, elementos);

        if (pos == -1) {
            System.out.println("Numero " + numero + " nao encontrado!");
        } else {
            System.out.println("Achei " + numero + " na posicao " + pos);
        }
    }

    public static int posicao(int numero, int[] elementos) {
        int pos = -1;
        for (int i = 0; i < elementos.length; i++) {
            if (numero == elementos[i]) {
                pos = i;
            }
        }
        return pos;
    }

}