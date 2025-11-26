
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngresa la operacion: " + "\n\n\t1) Suma." + "\n\t2) Resta." + "\n\t3) Multiplicacion." + "\n\t4) Division.");

        int operacion = scanner.nextInt();

        if(operacion == 1){
            System.out.println("\nElegiste Suma. ");
        } else if (operacion == 2) {
            System.out.println("\nElegiste Resta. ");
        } else if (operacion == 3) {
            System.out.println("\nElegiste Multiplicacion. ");
        } else if (operacion == 4) {
            System.out.println("\nElegiste Division. ");
        }

    }
}