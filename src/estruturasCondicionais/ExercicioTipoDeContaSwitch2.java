package estruturasCondicionais;

/*
Como Gerente eu gostaria que meus usuários pudessem digitar o tipo da conta e o sistema imprima qual a porcentagem
de juros que aquela conta irá oferecer para o cliente agilizar o acesso as informações.
Os tipos das contas são:
1. CONTA_POUPANÇA: 0,05%
2. CONTA_CORRENTE: 0,02%
3. CONTA_INVESTIMENTO: 0,1%
 */

import java.util.Scanner;

public class ExercicioTipoDeContaSwitch2 {
    public static void main(String[] args) {
        String conta = "CONTA CORRENTE";
        switch (conta) {
            case "CONTA POUPANÇA":
                System.out.println("CONTA POUPANÇA: 0,05%");
                break;
            case "CONTA CORRENTE":
                System.out.println("CONTA CORRENTE: 0,02%");
                break;
            case "CONTA INVESTIMENTO":
                System.out.println("CONTA INVESTIMENTO: 0,1%");
                break;
            default:
                System.out.println("CONTA INESISTENTE!!!");
        }
    }
}
