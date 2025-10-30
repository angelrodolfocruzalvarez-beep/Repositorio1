import java.util.Scanner;

public class VentaBates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioBulto = 100.0;   
        double precioIndividual = 108.0; 
        
        System.out.print("Ingrese la cantidad de bates a comprar: ");
        int cantidad = scanner.nextInt();
        
        double total;
        if (cantidad >= 10) {
            total = cantidad * precioBulto;
            System.out.println("Precio por bate: $" + precioBulto);
        } else {
            total = cantidad * precioIndividual;
            System.out.println("Precio por bate: $" + precioIndividual);
        }
        
        System.out.println("Cantidad de bates: " + cantidad);
        System.out.println("Total a pagar: $" + total);
        
        scanner.close();
    }
}