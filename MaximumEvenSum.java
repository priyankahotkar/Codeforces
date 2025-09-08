import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long maxVal = -1;
            if (a % 2 == 0 && b % 2 == 0) {
                maxVal = a * (b / 2) + 2;
            } else if (a % 2 == 0 && b % 2 != 0) {
                maxVal = -1;
            } else if (a % 2 != 0 && b % 2 == 0 && b % 4 != 0) {
                maxVal = -1;
            } else if (a % 2 != 0 && b % 4 == 0) {
                maxVal = a * (b / 2) + 2;
            } else {
                maxVal = a * b + 1;
            }
            System.out.println(maxVal);
        }
    }

    public static void findDivisors(long b, List<Long> divisors) {
        for (long i = 1; i * i <= b; i++) {
            if (b % i == 0) {
                divisors.add(i);
                if (i != b / i) {
                    divisors.add(b / i);
                }
            }
        }
    }
}
