package lacosRepeticao;

/*
Elaborar um programa que apresente os quadrados dos números inteiros existentes na faixa de valores de 15 até 200;
 */

public class ExercicioFor {
    public static void main(String[] args) {
       for (int i = 15; i <= 200; i++){
           System.out.println("O quadrado de " + i + " = " + (i * i));
       }
    }
}
