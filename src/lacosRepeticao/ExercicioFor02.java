package lacosRepeticao;

import java.util.Scanner;

public class ExercicioFor02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero que calculo a tabuada: ");
        int tabuada = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + "x" + i + " = " + (tabuada * i));
        }
    }
}
