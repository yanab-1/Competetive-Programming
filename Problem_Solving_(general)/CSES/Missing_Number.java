package CSES;

import java.util.Scanner;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = (long) n * (n + 1) / 2;
        long actsum = 0;
        for(int i = 1; i < n; i++){
            actsum += sc.nextInt();
        }
        System.out.println(sum - actsum);
    }
}
