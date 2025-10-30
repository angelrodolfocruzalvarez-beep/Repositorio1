public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers between 2 and 15:");
        for (int i = 2; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}