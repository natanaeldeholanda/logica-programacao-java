package lacosRepeticao;

/*
Eu como usuário gostaria que o sistema fizesse automaticamente a tabuada de 1 a 10
 */

public class Exercicio03For {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

    }
}
