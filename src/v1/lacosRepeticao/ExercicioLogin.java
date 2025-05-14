package v1.lacosRepeticao;

import java.util.Scanner;

/*
Apresentar ao usuário uma tela solicitando um login e depois uma senha. O usuário e senha corretos devem estar
armazenados em constantes no seu programa. Se o usuário acertar o usuário e a senha, exibir uma mensagem de
ACESSO CONDEDIDO, caso contrário, exibir uma mensagem de ACESSO NEGADO e voltar a pedir o login e senha.
Essa condição deve se repetir até que o usuário digite o login correto e a senha correta.
 */

public class ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Natanael";
        final String password = "ReiDoJava";
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.print("Digite seu Login: ");
            String loginDigitado = teclado.next();
            System.out.print("Digite sua Senha: ");
            String senhaDigitada = teclado.next();
            if (login.equals(loginDigitado) && password.equals(senhaDigitada)) {
                System.out.println("ACESSO CONDEDIDO");
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}