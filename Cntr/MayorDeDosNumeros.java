import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El mayor número es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El mayor número es: " + numero2);
        } else {
            System.out.println("Los números son iguales");
        }

        scanner.close();
    }
}