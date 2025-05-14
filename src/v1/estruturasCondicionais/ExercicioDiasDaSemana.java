package v1.estruturasCondicionais;

/*
Receba um número inteiro entre 1 e 7 e imprima o dia da semana correspondente, sendo 1 segunda-feira;
 */

import java.util.Scanner;

public class ExercicioDiasDaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** DIAS DA SEMANA ***");
        System.out.println("Digite um número inteiro entre 1 e 7: ");
        int diaSemana = teclado.nextInt();
        if(diaSemana == 1){
            System.out.println("Segunda-feira");
        }else if(diaSemana == 2){
            System.out.println("Terça-feira");
        }else if(diaSemana == 3){
            System.out.println("Quarta-feira");
        }else if(diaSemana == 4){
            System.out.println("Quinta-feira");
        }else if(diaSemana == 5){
            System.out.println("Sexta-feira");
        }else if(diaSemana == 6){
            System.out.println("Sábado");
        }else if(diaSemana == 7){
            System.out.println("Domingo");
        }else{
            System.out.println("Dia da semana inválido!!!");
        }
    }
}
