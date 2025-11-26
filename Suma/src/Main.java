import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Introduce el primer numero");
        numero1 = reader.nextInt ();

        System.out.println("Introduce el Segundo numero");
        numero2 = reader.nextInt ();

        int resultado = numero1+numero2;

        System.out.println("El resultado de:"+numero1 + "+" +numero2 + " es:" +resultado);
    }
    }