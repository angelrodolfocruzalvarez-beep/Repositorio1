import java.util.Scanner;

public class NumerosPrevios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Los números previos a " + numero + " son:");
        for (int i = 0; i < numero; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}