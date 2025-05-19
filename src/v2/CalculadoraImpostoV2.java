package v2;
/*
Crie uma classe que calcule uma determinada porcentagem de um dado salario
Criar uma classe
Aceitar um valor de entrada para o salario
Definir o valor da porcentagem (perguntar quanto?) = 30%
Calcular porcentagem
 */
public class CalculadoraImpostoV2 {
    public static void main(String[] args) {
        float salario = 2500.00F;
        float porcentagemImposto = 30F;
        float porcentagemDoSalario = salario * (porcentagemImposto / 100);
        System.out.println(porcentagemDoSalario);
    }
}
