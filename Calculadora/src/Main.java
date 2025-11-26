
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\tIngrese 2 numeros: \n\nNumero 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Numero 2: ");
        int numero2 = scanner.nextInt();

        System.out.println("\nIngresa la operacion: " + "\n\n\t1) Suma." + "\n\t2) Resta." + "\n\t3) Multiplicacion." + "\n\t4) Division.");

        int operacion = scanner.nextInt();

        if(operacion == 1){

            int resultado = numero1+numero2;
            System.out.println("El resultado es: " +resultado);

        }else if (operacion == 2) {

            int resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);

        } else if (operacion == 3) {

            int resultado = numero1*numero2;
            System.out.println("El resultado es: " +resultado);

        } else if (operacion == 4) {
            System.out.println("\nElegiste Division. ");
            if(numero2 == 0){
                System.out.println(" No se puede dividir entre cero. ");
            } else if (numero2 != 0) {
                int division = numero1 / numero2;
                System.out.println("¶nEl resultado es: "+ division);
            }

        }


    }
}