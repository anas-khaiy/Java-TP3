import java.util.Arrays;

public class Exercice4 {

    // affiche(double t[][])
    public static void affiche(double[][] t) {
        if (t == null) {
            System.out.println("Tableau null");
            return;
        }
        for (double[] row : t) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + (j < row.length - 1 ? "\t" : ""));
            }
            System.out.println();
        }
    }

    // boolean regulier(double t[][])
    public static boolean regulier(double[][] t) {
        if (t == null || t.length == 0)
            return true;
        int len = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != len)
                return false;
        }
        return true;
    }

    // double[] sommeLignes(double t[][])
    public static double[] sommeLignes(double[][] t) {
        if (t == null)
            return null;
        double[] sums = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double s = 0;
            for (double val : t[i]) {
                s += val;
            }
            sums[i] = s;
        }
        return sums;
    }

    // double[][] somme(double[][] t1, double[][] t2)
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (t1 == null || t2 == null)
            return null;
        if (!regulier(t1) || !regulier(t2))
            return null;

        // Check dimensions
        if (t1.length != t2.length)
            return null;
        if (t1.length > 0 && t1[0].length != t2[0].length)
            return null;
        if (t1.length == 0)
            return new double[0][0];

        int rows = t1.length;
        int cols = t1[0].length;
        double[][] res = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Programme de test
        System.out.println("--- Test Exercice 4 ---");

        double[][] t1 = {
                { 1.0, 2.0, 3.0 },
                { 4.0, 5.0, 6.0 }
        };
        double[][] t2 = {
                { 10.0, 20.0, 30.0 },
                { 40.0, 50.0, 60.0 }
        };
        double[][] tIrregular = {
                { 1.0, 2.0 },
                { 3.0, 4.0, 5.0 }
        };

        System.out.println("Affichage t1:");
        affiche(t1);

        System.out.println("t1 est régulier ? " + regulier(t1));
        System.out.println("tIrregular est régulier ? " + regulier(tIrregular));

        System.out.println("Somme des lignes de t1:");
        double[] s = sommeLignes(t1);
        System.out.println(Arrays.toString(s));

        System.out.println("Somme t1 + t2:");
        double[][] sumT = somme(t1, t2);
        affiche(sumT);

        System.out.println("Essaie somme t1 + tIrregular (doit être null): " + somme(t1, tIrregular));
    }
}
