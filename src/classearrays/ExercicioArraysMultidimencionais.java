package classearrays;

/*
Calcule a multiplicação dos elementos da diagonal principal de uma matriz quadrada
 */

public class ExercicioArraysMultidimencionais {
    public static void main(String[] args) {
        int[][] matriz = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            resultado = resultado * matriz[i][i];
        }
        System.out.println(resultado);
    }
}
