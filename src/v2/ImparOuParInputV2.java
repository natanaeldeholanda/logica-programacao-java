package v2;

import java.util.Scanner;

public class ImparOuParInputV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }
        teclado.close();
    }
}

