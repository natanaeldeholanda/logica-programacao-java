package v2;
/*
Receba uma idade como entrada
Se idade for maior de 18 imprima "Adulto"
Senão, imprima "Ainda não é adulto"
 */

public class ExercicioIfElse {
    public static void main(String[] args) {
        int idade = 18;

        // ==, !=, >, <, >=, <= -> operadores de comparação

        if (idade > 18) {
            System.out.println("Maior Idade");
        } else {
            System.out.println("Ainda não é Adulto");
        }
    }
}
