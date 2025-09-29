import java.util.Scanner;

public class RandomMood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double p = sc.nextDouble();

        // Recurrence relation:
        // Pt = (Pt-1 * (1 - p)) + ((1 - Pt-1) * p)

        double result = 0.5 + 0.5 * Math.pow(1 - 2 * p, n);
        System.out.printf("%.9f\n", result);
    }

    public static double probability(double p, int turn, double p1, double p2, int n) {
        if (turn == 1) {
            return (1 - p);
        }
        if (turn == 2) {
            return (p * p) + ((1 - p) * (1 - p));
        }

        double ans = p1 * p2 + ((1 - p1) * (1 - p2));
        return turn + 1 < n ? probability(p, turn + 1, p2, ans, n) : ans;
    }
}
