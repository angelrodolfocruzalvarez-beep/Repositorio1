import java.util.Scanner;

public class PrecioBalones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;

        System.out.print("Ingrese la cantidad de balones a comprar: ");
        int cantidad = scanner.nextInt();

        if (cantidad > 15) {
            precio = 85.0;
        } else if (cantidad > 10) {
            precio = 92.0;
        } else {
            precio = 99.0;
        }

        double costoTotal = cantidad * precio;

        System.out.println("Cantidad de balones: " + cantidad);
        System.out.println("Precio por balón: $" + precio);
        System.out.println("Costo total: $" + costoTotal);

        scanner.close();
    }
}