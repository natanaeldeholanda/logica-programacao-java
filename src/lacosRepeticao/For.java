package lacosRepeticao;

/*
Elabore uma rotina que apresente todos os números pares na faixa de 0 a 100
 */

public class For {
    public static void main(String[] args) {
        for (int contator = 0; contator <= 100; contator++) {
            if (contator % 2 == 0) {
                System.out.println(contator);
            }
        }

    }
}
