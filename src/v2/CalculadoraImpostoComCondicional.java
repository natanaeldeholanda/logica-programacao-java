package v2;
/*
Dado um determinado salário e o salário for maior que 4500 imprima 30% do valor
Senão, imprima 15% do valor
 */

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        double salario = 4500.00;

        if (salario > 4500) {
            System.out.println("30% do salário: " + (salario * 0.30));
        } else {
            System.out.println("15% do salário: " + (salario * 0.15));
        }
    }
}
