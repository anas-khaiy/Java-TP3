import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la hauteur du triangle : ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
