import java.util.Scanner;

public class CincoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = sc.nextInt();
        System.out.println("Ingrese el cuarto número: ");
        int num4 = sc.nextInt();
        System.out.println("Ingrese el quinto número: ");
        int num5 = sc.nextInt();

        int max = num1; 

        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        if(num4 > max) {
            max = num4;
        }
        if(num5 > max) {
            max = num5;
        }

        System.out.println("El número mayor es: " + max);

        sc.close();
    }
}

