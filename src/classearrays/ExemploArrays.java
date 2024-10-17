package classearrays;

import java.util.Arrays;

public class ExemploArrays {
    public static void main(String[] args) {
        double[] notas = new double[3];
        notas[0] = 7;
        notas[1] = 8;
        notas[2] = 9;
        double media = Arrays.stream(notas).sum() / notas.length;
        System.out.println("A média é: " + media);
    }
}
