package v1.estruturasCondicionais;

import java.util.Scanner;

public class
ExercicioAlistamentoMiliarEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** SISTEMA DE ALISTAMENTO MILITAR ***");

        char sexo = obterSexo(scanner);
        int idade = obterIdade(scanner);
        processarAlistamento(sexo, idade);

        scanner.close();
    }

    private static char obterSexo(Scanner scanner) {
        System.out.print("Digite seu sexo (M ou F): ");
        return Character.toUpperCase(scanner.next().charAt(0));
    }

    private static int obterIdade(Scanner scanner) {
        System.out.print("Digite sua idade: ");
        return scanner.nextInt();
    }

    private static void processarAlistamento(char sexo, int idade) {
        if (sexo == 'M') {
            processarAlistamentoMasculino(idade);
        } else if (sexo == 'F') {
            processarAlistamentoFeminino(idade);
        } else {
            System.out.println("Sexo inválido! Por favor, digite M ou F.");
        }
    }

    private static void processarAlistamentoMasculino(int idade) {
        if (idade >= 18) {
            System.out.println("ALISTAMENTO OBRIGATÓRIO");
            System.out.println("ALISTAMENTO CONFIRMADO");
        } else {
            System.out.println("ALISTAMENTO NÃO PERMITIDO");
        }
    }

    private static void processarAlistamentoFeminino(int idade) {
        if (idade >= 18) {
            System.out.print("DESEJA SE ALISTAR? (S/N): ");
            char resposta = Character.toUpperCase(new Scanner(System.in).next().charAt(0));
            if (resposta == 'S') {
                System.out.println("ALISTAMENTO CONFIRMADO");
            } else if (resposta == 'N') {
                System.out.println("ALISTAMENTO NÃO CONFIRMADO");
            } else {
                System.out.println("Resposta inválida! Por favor, responda com S ou N.");
            }
        } else {
            System.out.println("ALISTAMENTO NÃO PERMITIDO");
        }
    }
}
