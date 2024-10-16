package lacosRepeticao;

/*
Eu como usuário gostaria de imprimir todos os números ímpares de 0 até o valor digitado pelo usuário.
 */

import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valorFinal = teclado.nextInt();
        int i = 0;
        while (i <= valorFinal) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}
