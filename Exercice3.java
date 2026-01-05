import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de valeurs : ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            int[] squares = new int[n];
            int currentOdd = 1;

            for (int i = 0; i < n; i++) {
                squares[i] = currentOdd * currentOdd;
                System.out.println(currentOdd + " a pour carre " + squares[i]);
                currentOdd += 2;
            }
        }
        scanner.close();
    }
}
