package lacosRepeticao;

/*
Eu como usuário gostaria que o sistema fizesse automaticamente a tabuada de 1 a 10
-> Para fazer esse exercício, é utilizado um for, dentro de outro for, ou seja, aninhado.
 */

public class ExercicioFor03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("----------------");
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("----------------");
        }

    }
}
