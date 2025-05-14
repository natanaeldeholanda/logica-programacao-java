package v1.logicaProgramacao;

import java.util.Scanner;

public class RecebendoDadosTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Seu nome é: " + nome + " e sua idade é: " + idade);
        teclado.close();
    }
}
