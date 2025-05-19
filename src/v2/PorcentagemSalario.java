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

public class PorcentagemSalario {
    public static void main(String[] args) {
        float salario = 2500.00F;
        float porcentagemImposto = 30F;
        float porcentagemDoSalario = salario * (porcentagemImposto / 100);
        System.out.println("30% do salário: " + porcentagemDoSalario);

        porcentagemImposto = 15F;
        porcentagemDoSalario = salario * (porcentagemImposto / 100);
        System.out.println("15% do salário: " + porcentagemDoSalario);

        porcentagemImposto = 5F;
        porcentagemDoSalario = salario * (porcentagemImposto / 100);
        System.out.println("5% do salário: " + porcentagemDoSalario);
    }
}
