package variaveis;

public class CalculadoraImposto {
    private double salario;
    private double porcentagem;

    public CalculadoraImposto(double salario, double porcentagem) {
        this.salario = salario;
        this.porcentagem = porcentagem;
    }

    public double calcularNovoSalario() {
        return salario + (salario * porcentagem);
    }

    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto(2000.0, 0.10);
        double novoSalario = calculadora.calcularNovoSalario();
        System.out.printf("Novo Salário: R$ %.2f%n", novoSalario);
        System.out.printf("e o acréscimo é de: R$ %.2f%n", novoSalario - 2000.0);
    }
}
