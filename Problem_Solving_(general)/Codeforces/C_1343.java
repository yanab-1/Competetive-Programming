package Codeforces;

import java.util.Scanner;

public class C_1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static int getSign(int i){
        return i < 0 ? -1 : 1;
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        long ans = 0;
        int i = 0;
        while (i < n) {
            int sign = getSign(a[i]);
            int max = a[i];
            int j = i + 1;
            while(j < n && sign == getSign(a[j])){
                max = Math.max(max, a[j]);
                j++;
            }
            ans += max;
            i = j;
        }
        System.out.println(ans);
    }
}
