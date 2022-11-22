/**
 * @author Gabriel Correia Stabile
 * Desafio DIO #2: Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
 */

/**
 * @author Gabriel Correia Stabile
 * Desafio DIO #2: Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
 */

import java.util.Scanner;

public class D2_SomaMultiplos {
    public static void main(String[] args) {
        int a, n;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        n = input.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++){
            if(i % a == 0) soma +=i;
        }
        System.out.println(soma);
    }
}