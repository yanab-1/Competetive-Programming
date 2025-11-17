package Codeforces;

import java.util.Scanner;

public class C_1335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] freq = new int[n + 1];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            freq[a[i]]++;
        }
        int max = 0;
        int unique = 0;
        for(int i = 1; i <= n; i++){
            max = Math.max(freq[i], max);
            if(freq[i] > 0) unique++;
        }
        System.out.println(Math.max(Math.min(max - 1, unique), Math.min(max, unique - 1)));
    }
}
