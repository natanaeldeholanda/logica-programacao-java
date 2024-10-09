package logicaProgramacao;

public class ImpostoDeRendaSwitchCase {

    private static final double ISENTO = 1903.98;
    private static final double FAIXA_1_MAX = 2826.65;
    private static final double FAIXA_2_MAX = 3751.05;
    private static final double FAIXA_3_MAX = 4664.68;

    public static void main(String[] args) {
        double salario = 5000;
        calcularImposto(salario);
    }

    private static void calcularImposto(double salario) {
        int faixa = determinarFaixa(salario);
        switch (faixa) {
            case 0: // Isento
                System.out.println("Isento");
                break;
            case 1: // 7.5%
                calcularEExibirImposto(salario, 0.075);
                break;
            case 2: // 15%
                calcularEExibirImposto(salario, 0.15);
                break;
            case 3: // 22.5%
                calcularEExibirImposto(salario, 0.225);
                break;
            case 4: // 27.5%
                calcularEExibirImposto(salario, 0.275);
                break;
            default:
                System.out.println("Salário inválido");
        }
    }

    private static int determinarFaixa(double salario) {
        if (salario <= ISENTO) {
            return 0; // Isento
        } else if (salario <= FAIXA_1_MAX) {
            return 1; // 7.5%
        } else if (salario <= FAIXA_2_MAX) {
            return 2; // 15%
        } else if (salario <= FAIXA_3_MAX) {
            return 3; // 22.5%
        } else {
            return 4; // 27.5%
        }
    }

    private static void calcularEExibirImposto(double salario, double taxa) {
        double imposto = salario * taxa;
        System.out.printf("%.1f%%: R$ %.2f%n", taxa * 100, imposto);
    }
}
