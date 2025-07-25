import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int copyOfX = x;
            List<Integer> list = new ArrayList<>();

            while (copyOfX > 0) {
                int digit = copyOfX % 10;
                list.add(digit);
                copyOfX /= 10;
            }

            Collections.sort(list);
            System.out.println(list.get(0));
        }
    }
}
