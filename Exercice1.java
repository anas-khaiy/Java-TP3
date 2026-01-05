import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la valeur de n : ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }
            System.out.println("La somme des " + n + " premiers termes de la série harmonique est : " + sum);
        }
        scanner.close();
    }
}
