package br.com.dio.exercicios.desafio;

import java.util.*;

public class D4_FizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        // System.out.println("Digite um número: ");
        int num = number.nextInt();
        verificar(num);
    }

    public static void verificar(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");

        } else if (num % 3 == 0 || num % 5 == 0) {
            if (num % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }
        } else {
            System.out.println(num);
        }
    }

}
