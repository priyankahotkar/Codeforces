import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumericTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            String[] strings = new String[m];
            for (int i = 0; i < m; i++) {
                strings[i] = sc.next();
            }

            for (int i = 0; i < m; i++) {
                String curr = strings[i];
                if (curr.length() != n) {
                    System.out.println("NO");
                    continue;
                }

                Map<Character, Integer> charToNum = new HashMap<>();
                Map<Integer, Character> numToChar = new HashMap<>();
                boolean isValid = true;

                for (int j = 0; j < n; j++) {
                    char c = curr.charAt(j);
                    int num = arr[j];

                    if (charToNum.containsKey(c)) {
                        if (charToNum.get(c) != num) {
                            isValid = false;
                            break;
                        }
                    } else {
                        charToNum.put(c, num);
                    }

                    if (numToChar.containsKey(num)) {
                        if (numToChar.get(num) != c) {
                            isValid = false;
                            break;
                        }
                    } else {
                        numToChar.put(num, c);
                    }
                }

                System.out.println(isValid ? "YES" : "NO");
            }
        }
    }
}
