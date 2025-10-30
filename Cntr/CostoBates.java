import java.util.Scanner;

public class CostoBates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de bates a comprar: ");
        int numBates = scanner.nextInt();
        
        double costoTotal;
        
        if (numBates <= 10) {
            costoTotal = numBates * 250;
        } else {
            costoTotal = (10 * 250) + ((numBates - 10) * 230);
        }
        
        System.out.println("Número de bates comprados: " + numBates);
        System.out.println("Costo total: $" + costoTotal);
        
        scanner.close();
    }
}