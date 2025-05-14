package v1.estruturasCondicionais;

import java.util.Scanner;

/*
Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem o nome
de usuário (login) no sistema para agilizar o processo de migração do sistema antigo para o novo.

O usuário não pode deixar "", ou criar um usuário com o login "admin" ou "administrador".
Se o valor entrado for válido, o sistema deverá exibir uma mensagem <nome do usuário> cadastrado com sucesso.
Senão o sistema deverá mostrar o erro "Usuário invá;ido"
 */
public class ExercicioCadastroLogin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome de usuário: ");
        String nome = teclado.next();
        System.out.println("Digite a senha: ");
        String senha = teclado.next();
        if (nome.isBlank() || nome.equalsIgnoreCase("") ||
                nome.equalsIgnoreCase("admin") ||
                nome.equalsIgnoreCase("administrador") ||
                senha.isBlank() || senha.equalsIgnoreCase("admin") ||
                senha.equalsIgnoreCase("administrador")) {
            System.out.println("Erro: Usuário inválido");
        } else {
            System.out.println("Usuário: " + nome + " cadastrado com sucesso");
        }
        teclado.close();
    }
}
