package lacosRepeticao;

import java.util.Scanner;

/*
Como usuário eu gostaria de ter um menu visual que seja navegável através de números.
O menu deve ser exibido da seguinte forma:
1. Calcular Imposto
2. Depositar Salário
3. Sair

OBS: O menu deve ficar disponível enquanto eu não digitar o número 3.
Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
 */
public class ExercicioMenuWhile {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1 - Calcular Imposto");
            System.out.println("2 - Depositar Salário");
            System.out.println("3 - Sair");
            System.out.printf("Digite a opção desejada: ");
            opcao = teclado.nextInt();
        }
        System.out.println("Fim do programa");
    }
}