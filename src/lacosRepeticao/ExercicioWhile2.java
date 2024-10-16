package lacosRepeticao;

import java.util.Scanner;

/*
Como usuário, gostaria de ter um menu visual que seja navegável através de números.
1. Calcular Imposto
2. Depositar salário
3. Sair
OBS: O menu deve focar disponivel enquanto eu não digitar o número 3
Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado em cada operação.
 */
public class ExercicioWhile2 {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            System.out.printf("Digide a opção desejada: ");
            opcao = teclado.nextInt();
        }
        System.out.println("Fim do Programa");
    }
}
