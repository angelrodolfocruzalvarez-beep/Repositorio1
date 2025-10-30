import java.util.Scanner;

public class GradeValidator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[10];

        for (int i = 0; i < 10; i++) {
            boolean validGrade = false;
            while (!validGrade) {
                System.out.printf("Ingrese la calificación %d (6-10): ", i + 1);
                double grade = scanner.nextDouble();
                
                if (grade >= 6 && grade <= 10) {
                    grades[i] = grade;
                    validGrade = true;
                } else {
                    System.out.println("Calificación inválida. Debe estar entre 6 y 10.");
                }
            }
        }

        System.out.println("\nCalificaciones ingresadas:");
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Calificación %d: %.2f\n", i + 1, grades[i]);
        }

        scanner.close();
    }
}