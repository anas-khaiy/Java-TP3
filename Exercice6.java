import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt())
            return;
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = scanner.nextInt();
        }

        int MAXV = 100000;
        int[] freq = new int[MAXV + 1];
        int distinct = 0;

        // Initial window [0..k-1]
        for (int i = 0; i < k; i++) {
            if (freq[T[i]] == 0) {
                distinct++;
            }
            freq[T[i]]++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(distinct);

        // Slide window from k to n-1
        for (int i = k; i < n; i++) {
            int out = T[i - k];
            int in = T[i];

            // Remove out
            freq[out]--;
            if (freq[out] == 0) {
                distinct--;
            }

            // Add in
            if (freq[in] == 0) {
                distinct++;
            }
            freq[in]++;

            sb.append(" ").append(distinct);
        }

        System.out.println(sb.toString());
        scanner.close();
    }
}
