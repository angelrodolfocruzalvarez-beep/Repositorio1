import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        double horas = sc.nextDouble();

        double tarifaBase = 50.0;
        double tarifaExtra = 70.0;
        double limite = 40.0;
        double salario;

        if (horas <= limite) {
            salario = tarifaBase * horas;
        } else {
            salario = tarifaBase * limite + tarifaExtra * (horas - limite);
        }

        System.out.printf("Salario: $%.2f%n", salario);
        sc.close();
    }
}