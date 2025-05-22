package v2;

public class ImparOuPar {
    public static void main(String[] args) {
        /*
        Dado um número inteiro, imprima se o número é par ou ímpar
         */
        int numero = 10;
        // ==, !=, >, <, >=, <= -> operadores de comparação
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }
    }
}
