import java.util.Scanner;

public class GradeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade;

        do {
            System.out.print("Ingrese una calificación (0-10): ");
            grade = scanner.nextDouble();
            
            if (grade < 0 || grade > 10) {
                System.out.println("Calificación no válida. Debe estar entre 0 y 10.");
            }
        } while (grade < 0 || grade > 10);

        System.out.println("Calificación válida ingresada: " + grade);
        scanner.close();
    }
}