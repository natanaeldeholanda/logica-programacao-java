package logicaProgramacao;

public class ReutilizandoVariaveis {
    public static void main(String[] args) {
        double salario = 5000.0;
        double resultado = salario * 0.30;
        System.out.println("30% é: R% " + resultado);
        resultado = (salario * 0.15);
        System.out.println("15% é: R% " + resultado);
        resultado = (salario * 0.10);
        System.out.println("10% é: R% " + resultado);
    }
}
