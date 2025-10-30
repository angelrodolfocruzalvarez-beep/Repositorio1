import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int menor = (numero1 < numero2) ? numero1 : numero2;

        System.out.println("El menor de los dos números es: " + menor);
        
        scanner.close();
    }
}