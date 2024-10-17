package classearrays;

/*
Armazenar em dois vetores, V1 e V2, 9 valores numéricos inteiros, digitados pelo usuário. Em seguida, exibir
o resultado da multiplicação dos números do V1 com os corrrespondentes em V2.
 */

import java.util.Scanner;

public class ExercicioArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, na posição " + i + ": ");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Vetor 2, na posição " + i + ": ");
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] * array2[i];
            System.out.print("Vetor 3 multiplicado "+ "| " + array3[i] + " | ");
        }
    }
}
