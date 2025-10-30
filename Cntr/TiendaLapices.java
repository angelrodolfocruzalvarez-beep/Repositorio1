import java.util.Scanner;

public class TiendaLapices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double costoTotal, costoUnitario;
        
        System.out.print("Ingrese la cantidad de lápices a comprar: ");
        int cantidad = scanner.nextInt();
        
        if (cantidad >= 100) {
            costoUnitario = 0.80;
        } else if (cantidad > 50) {
            costoUnitario = 1.20;
        } else if (cantidad >= 30) {
            costoUnitario = 1.50;
        } else {
            costoUnitario = 2.10;
        }
        
        costoTotal = cantidad * costoUnitario;
        
        System.out.println("\nResumen de la compra:");
        System.out.println("Cantidad de lápices: " + cantidad);
        System.out.println("Costo unitario: $" + costoUnitario);
        System.out.println("Costo total: $" + costoTotal);
        
        scanner.close();
    }
}