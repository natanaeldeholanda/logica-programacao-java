package v1.classearrays;

/*
Calcule a multiplicação dos elementos da diagonal principal de uma matriz quadrada
 */

public class ExercicioArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz[0][0] = 34;
        matriz[0][1] = 356;
        matriz[0][2] = 5;
        matriz[1][0] = 21;
        matriz[1][1] = 67;
        matriz[1][2] = 90;
        matriz[2][0] = 45;
        matriz[2][1] = 21;
        matriz[2][2] = 55;
        int resultado = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    resultado = resultado * matriz[i][j];
                }
                System.out.println(resultado);
            }
        }
    }
}
