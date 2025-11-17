package Codeforces;

import java.util.Scanner;

public class A_112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        int n = s1.compareTo(s2);
        if(n == 0) System.out.println(0);
        else if(n < 0) System.out.println(-1);
        else System.out.println(1);
    }
}
