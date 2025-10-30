import java.util.Scanner;

public class ContinueProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            System.out.print("¿Desea continuar S/N? ");
            response = scanner.nextLine().toUpperCase();
        } while (!response.equals("N"));

        scanner.close();
    }
}