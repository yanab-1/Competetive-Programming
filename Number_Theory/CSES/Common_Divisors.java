package CSES;

import java.util.Scanner;

public class Common_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] count = new int[1000001];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            count[a[i]]++;
        }
        for(int i = 100000; i>= 0; i--){
            int mul = 0;
            for(int j = i; j <= 1000000; j+=i){
                mul += count[j];
            }
            if(mul >= 2){
                System.out.println(i);
                return;
            }
        }
        System.out.println(1);
    }
}
