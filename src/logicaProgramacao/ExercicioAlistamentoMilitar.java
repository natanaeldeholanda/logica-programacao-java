package logicaProgramacao;

import java.util.Scanner;

/*
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parametros,
para que eu possa agilizar no processo de cadastramento:
-> Sexo sendo válido apenas M ou F e idade;
-> Sexo se for masculino e idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório;
-> Sexo se for masculino e idade for menor que 18 o sistema deve imprimir alistamento não permitido;
-> Sexo se for feminino e idade maior ou igual a 18 o sistema deve perguntar se a pessoa deseja se alistar;
-> Sexo se for feminino e idade menor que 18 o sistema deve imprimir alistamento não permitido;
 */
public class ExercicioAlistamentoMilitar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** SISTEMA DE ALISTAMENTO MILITAR ***");
        System.out.println("Digite seu sexo (M ou F): ");
        char sexo = teclado.next().charAt(0);
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        if (sexo == 'M' && idade >= 18) {
            System.out.println("ALISTAMENTO OBRIGATÓRIO");
            System.out.println("ALISTAMENTO CONFIRMADO");
        } else if (sexo == 'M' && idade < 18) {
            System.out.println("ALISTAMENTO NÃO PERMITIDO");
        }
        if (sexo == 'F' && idade >= 18) {
            System.out.println("DESEJA SE ALISTAR? (S/N)");
            char resposta = teclado.next().charAt(0);
            if (resposta == 'S') {
                System.out.println("ALISTAMENTO CONFIRMADO");
            } else if (resposta == 'N') {
                System.out.println("ALISTAMENTO NÃO CONFIRMADO");
            }
        } else if (sexo == 'F' && idade < 18) {
            System.out.println("ALISTAMENTO NÃO PERMITIDO");
        }
        teclado.close();
    }
}


