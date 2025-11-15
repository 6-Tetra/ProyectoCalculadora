import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma, resta, division, mult;
        System.out.println("------calculadora basica------");
        System.out.println("\n Ingresa un numero:");
        int num1 = scanner.nextInt();
        System.out.println("\n Ingresa un numero:");
        int num2 = scanner.nextInt();

        suma = num1 + num2;
        mult = num1 + num2;
        resta = num1 + num2;
        division = num1 + num2;

        System.out.println("\n Resultado: " + suma);
    }
}