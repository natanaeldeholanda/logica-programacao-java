package logicaProgramacao;

/*
Dado um determinado salário, se o salário for maior que 4500, imprima 30% do valor, senão, imprima 15% do valor.
Desafio 1: Utilize apenas uma variável para guardar o resultado e imprimir no final
Desafio 2: Diga na impressão se é 30% ou 10%
 */
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0.0F;
        String porcentagem = "";


        if (salario > 4500.0F) {
            resultado = 0.30F * salario;
            porcentagem = "30%";
        } else {
            resultado = 0.15F * salario;
            porcentagem = "15%";
        }
        //Resposta desafio 2
        System.out.println("O valor final em porcentagem é de " + porcentagem + " e o valor final é de R$: " + resultado);
    }
}
