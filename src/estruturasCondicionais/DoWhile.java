package estruturasCondicionais;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        String desejaContinuar;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Player 1: Digite um número de 0 a 10: ");
            int num1 = teclado.nextInt();
            System.out.println("Player 2: Digite um número de 0 a 10: ");
            int num2 = teclado.nextInt();
            System.out.println("Acertou? " + (num1 == num2));
            System.out.println("Deseja continuar Jogando: (S/N): ");
            desejaContinuar = teclado.next();
        } while (desejaContinuar.equalsIgnoreCase("S"));
        System.out.println("Fim do Jogo");
    }
}
