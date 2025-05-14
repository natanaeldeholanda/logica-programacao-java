package v1.estruturasCondicionais;

/*
Receba um número inteiro entre 1 e 7 e imprima o dia da semana correspondente, sendo 1 segunda-feira;
 */

import java.util.Scanner;

public class ExercicioDiasDaSemanaSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** DIAS DA SEMANA ***");
        System.out.println("Digite um número inteiro entre 1 e 7: ");
        int diaSemana = teclado.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia da semana inválido!!!");
        }
        System.out.println("Fim do programa.");
    }
}
