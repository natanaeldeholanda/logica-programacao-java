package v2;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos
        byte b = 127; // -128 a 127
        short s = 32767; // -32.768 a 32.767
        int i = 2147483647; // -2.147.483.648 a 2.147.483.647
        long l = 9223372036854775807L; // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        float f = 3.14f; // -3,40282347E+38 a 3,40282347E+38
        double d = 3.14; // -1,79769313486231570E+308 a 1,79769313486231570E+308
        char c = 'A'; // Caracteres Unicode
        boolean bool = true; // true ou false

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
