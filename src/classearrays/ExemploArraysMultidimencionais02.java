package classearrays;

import java.util.Scanner;

public class ExemploArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][3];
//        arrayMulti[0][0] = 13;
//        arrayMulti[0][1] = 45;
//        arrayMulti[0][2] = 67;
//        arrayMulti[1][0] = 69;
//        arrayMulti[1][1] = 78;
//        arrayMulti[1][2] = 81;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("Digite o valor na posição" + "[" + i + "][" + j + "] = ");
                arrayMulti[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("[" + i + "][" + j + "] = " + arrayMulti[i][j]);
            }
        }

    }
}
