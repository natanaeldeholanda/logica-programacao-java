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

public class ExercicioTipoDeContaSwitch {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE CALCULO DE JUROS ***");
        System.out.println("TIPOS DE CONTA: ");
        System.out.println("1 - CONTA POUPANÇA: ");
        System.out.println("2 - CONTA CORRENTE: ");
        System.out.println("3 - CONTA INVESTIMENTO: ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tipo da conta: ");
        int tipoConta = teclado.nextInt();
        System.out.println("Digite o valor da conta: ");
        double valorConta = teclado.nextDouble();
        switch (tipoConta) {
            case 1:
                System.out.println("CONTA POUPANÇA: 0,05%");
                break;
            case 2:
                System.out.println("CONTA CORRENTE: 0,02%");
                break;
            case 3:
                System.out.println("CONTA INVESTIMENTO: 0,1%");
                break;
            default:
                System.out.println("Conta inválida!!!");
                break;
        }
        if (tipoConta == 1) {
            double jurosConta = valorConta * 0.05;
            System.out.println("Juros da conta: " + (jurosConta + valorConta));
        } else if (tipoConta == 2) {
            double jurosConta = valorConta * 0.02;
            System.out.println("Juros da conta: " + (jurosConta + valorConta));
        } else if (tipoConta == 3) {
            double jurosConta = valorConta * 0.1;
            System.out.println("Juros da conta: " + (jurosConta + valorConta));
        } else {
            System.out.println("Tipo de Conta inválida!!!");
        }
    }
}
