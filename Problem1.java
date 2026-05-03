import java.util.*;

class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().toLowerCase();
        boolean[] seen = new boolean[26];
        int maxS = 0;
        for (char ch : S.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int idx = ch - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    maxS += idx + 1;
                }
            }
        }
        System.out.println(maxS);
    }
}
/* Input: HELLO
Output: 40 */

/* Unique letters are:
h -> 8
e -> 5
l -> 12
o -> 15
l appears twice, but it is counted only once.
Total: 8 + 5 + 12 + 15 = 40 */