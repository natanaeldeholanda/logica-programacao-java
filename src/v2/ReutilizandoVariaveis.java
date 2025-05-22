package v2;

/*
Crie uma variável que irá guardar o valor de um salário
Calcule a porcentagem desse salário, sendo os valores da porcentagem
30%
15%
5%
A cada vez que você calcular guarde o resultado em uma variável
Imprima o resultado e reutilize a variável que guarda o resultado para o novo cálculo
 */

public class ReutilizandoVariaveis {
    public static void main(String[] args) {
        double salario = 5000;
        double resultado = salario * 0.30;
        System.out.println("30% do salário é: " + resultado);

        resultado = salario * 0.15;
        System.out.println("15% do salário é: " + resultado);

        resultado = salario * 0.05;
        System.out.println("5% do salário é: " + resultado);
    }
}
