public class NumerosSaltoLinea {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + " ");
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        // Add final line break if the last number isn't multiple of 7
        if (30 % 7 != 0) {
            System.out.println();
        }
    }
}