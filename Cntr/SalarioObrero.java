import java.util.Scanner;

public class SalarioObrero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double TARIFA_NORMAL = 14.00;
        final double TARIFA_EXTRA = 26.00;
        final int HORAS_NORMALES = 40;
        
        System.out.print("Ingrese el número de horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        

        double salarioTotal;
        
        if (horasTrabajadas <= HORAS_NORMALES) {

            salarioTotal = horasTrabajadas * TARIFA_NORMAL;
        } else {

            double horasExtras = horasTrabajadas - HORAS_NORMALES;
            salarioTotal = (HORAS_NORMALES * TARIFA_NORMAL) + (horasExtras * TARIFA_EXTRA);
        }
        

        System.out.printf("El salario total es: $%.2f%n", salarioTotal);
        
        scanner.close();
    }
}