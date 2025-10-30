import java.util.Scanner;

public class GradesProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        double[][] grades = new double[5][3];
        
    
        for (int student = 0; student < 5; student++) {
            System.out.println("\nIngrese las calificaciones para el alumno " + (student + 1) + ":");
            
            for (int grade = 0; grade < 3; grade++) {
                System.out.print("Calificación " + (grade + 1) + ": ");
                grades[student][grade] = scanner.nextDouble();
            }
        }
        
    
        System.out.println("\nCalificaciones ingresadas:");
        for (int student = 0; student < 5; student++) {
            System.out.print("Alumno " + (student + 1) + ": ");
            for (int grade = 0; grade < 3; grade++) {
                System.out.print(grades[student][grade] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}