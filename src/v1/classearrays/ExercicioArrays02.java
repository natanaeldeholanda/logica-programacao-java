package v1.classearrays;

/*
Armazenar em dois vetores, V1 e V2, 9 valores numéricos inteiros, digitados pelo usuário. Em seguida, exibir
o resultado da multiplicação dos números do V1 com os corrrespondentes em V2.
OUTRA FORMA
 */

import java.util.Scanner;

public class ExercicioArrays02 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner scanner = new Scanner(System.in);
        String resultadoMultiplicacao = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, na posição " + i + ": ");
            array1[i] = scanner.nextInt();
            System.out.println("Vetor 2, na posição " + i + ": ");
            array2[i] = scanner.nextInt();
            array3[i] = array1[i] * array2[i];
            resultadoMultiplicacao = resultadoMultiplicacao + array3[i] + " ";
        }
        System.out.println(resultadoMultiplicacao);
    }
}