import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;

            while (n > 0) {
                if (n >= 4) {
                    n -= 4;
                    count++;
                } else if (n >= 2) {
                    n -= 2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
