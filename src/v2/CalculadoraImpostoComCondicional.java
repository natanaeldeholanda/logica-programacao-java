package v2;
/*
Dado um determinado salário e o salário for maior que 4500 imprima 30% do valor
Senão, imprima 15% do valor
 */

/*
Desafio -> Utilize apenas uma variável para guardar o resultado e imprima o final
Desafio 2 -> Diga na impressão se é 30% ou 15%
 */

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        double salario = 4700.00;
        double resultado;
        String porcentagem = "";

        if (salario > 4700) {
            resultado = salario * 0.3;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15;
            porcentagem = "15%";
        }
        System.out.println("O resultado da porcentagem é: R$" + resultado + "O que corrresponde a : " + porcentagem);
    }
}
