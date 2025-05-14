package v1.estruturasCondicionais;

import java.util.Scanner;

/*
Eu como usuário, gostaria de ter o nome e a idade de participantes de um torneio de natação e que o sistema imprimisse
da segunte forma:
-> Menor que 10 anos: <Nome> participará da categoria infantil
-> Entre 11 e 15 anos: <Nome> participará da categoria Juvenil
-> Entre 16 e 19 anos: <Nome> participará da categoria Pré-adulto
-> Acima de 20 anos: <Nome> participará da categoria Adulto
Para que eu possa rapidamente classificar todos os participantes.

Leitura complementar:
-> Processos de desenvolvimento de software
-> Metodologias Ágeis
-> SCRUM
*/
public class ExercicioTorneioDeNatacao {
    public static void main(String[] args) {
//        String nome = "Joaquim";
//        int idade = 20;
//        if (idade <= 10) {
//            System.out.println(nome + " participará da categoria Infantil");
//        } else if (idade >= 11 && idade <= 15) {
//            System.out.println(nome + " participará da categoria Juvenil");
//        } else if (idade >= 16 && idade <= 19) {
//            System.out.println(nome + " participará da categoria Pré-adulto");
//        } else {
//            System.out.println(nome + " participará da categoria Adulto");
//        }

        /* Exercício lendo dados do teclado */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade <= 10) {
            System.out.println(nome + " participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-adulto");
        } else {
            System.out.println(nome + " participará da categoria Adulto");
        }
        teclado.close();
    }
}
