import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int  suma, resta, division;
        System.out.println("-----Calculadora basica-----");
        System.out.println(" ¶n Ingresa un numero: ");
        int num1 = scanner.nextInt();
        System.out.println(" ¶n Ingresa un numero: ");
        int num2 = scanner.nextInt();
        if(num2 == 0){
            System.out.println(" No se puede dividir entre cero. ");
        } else if (num2 != 0) {
            division = num1 / num2;
            System.out.println("¶n Resultado: "+ division);
        }



    }
}

