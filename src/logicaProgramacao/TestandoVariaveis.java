package logicaProgramacao;

public class TestandoVariaveis {
    public static void main(String[] args) {
        // byte, short, int, long, float, double, boolean, char, String
        char masculino = 'M';
        System.out.println(masculino);
        masculino = 'm';
        System.out.println(masculino);
        String frase = "Aqui você pode inserir uma frase bem grande";
        System.out.println(frase);

        boolean trueE = true;
        boolean falseE = false;
        System.out.println(trueE);
        System.out.println(falseE);

        System.out.println("Testando condicionais: ");
        int idade = 16;
        if (idade >= 18) {
            System.out.println("Ok, pode comprar bebida");
        } else {
            System.out.println("Você não é maior de idade, não pode comprar bebida");
        }
    }
}
