package lacosRepeticao;

/*
Elabore uma rotina que apresente todos os números pares na faicha de o a 100
 */

public class For {
    public static void main(String[] args) {

        int contator = 0;
        for(contator = 0; contator <= 100; contator++){
            if(contator % 2 == 0){
                System.out.println(contator);
            }
        }

    }
}
