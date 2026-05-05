/* ASSIGNMENT 2 */
/* PROBLEM 2:  Array Transformation Cost Minimization */
import java.util.*;
class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        long K = Long.parseLong(sc.nextLine().trim());
        long rem = A[0] % K;
        for (int i = 1; i < N; i++) {
            if (A[i] % K != rem) {
                System.out.println(-1);
                return;
            }
        }
        long[] B = new long[N];
        for (int i = 0; i < N; i++) {
            B[i] = (A[i] - rem) / K;
        }
        Arrays.sort(B);
        long median = B[N / 2];
        long operations = 0;
        for (int i = 0; i < N; i++) {
            operations += Math.abs(B[i] - median);
        }
        System.out.println(operations);
    }
}
/* Input:
4
1 3 5 7
2
Output: 4*/
/* 1 → 5 = 2 operations
3 → 5 = 1 operation
5 → 5 = 0 operation
7 → 5 = 1 operation

Total = 4 */