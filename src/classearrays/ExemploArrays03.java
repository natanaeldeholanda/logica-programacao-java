package classearrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploArrays03 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }
        double media = Arrays.stream(notas).sum() / notas.length;
        System.out.println("A média é: " + media);
    }
}