package v1.lacosRepeticao;

/*
Elabore um programa que apresente o somatório dos números na faixa de 1 até 500;
 */

public class ExercicioFor04 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 500; i++) {
            soma += i;
        }
        System.out.println("O somatório na faixa de 1 até 500 é: " + soma);
    }
}
