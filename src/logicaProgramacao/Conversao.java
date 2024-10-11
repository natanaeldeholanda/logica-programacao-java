package logicaProgramacao;

public class Conversao {
    public static void main(String[] args) {
        double salario = 2655.10;
        int valor = (int) salario;

        int valor2 = 2655;
        double valor3 = (double) valor2;
        System.out.printf("O valor da variável double é: %.2f e o valor da variável int é: %d%n", salario, valor);
        System.out.println(valor3);
    }
}
