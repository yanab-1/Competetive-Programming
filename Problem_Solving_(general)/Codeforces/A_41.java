package Codeforces;

import java.util.Scanner;

public class A_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.length() != s2.length()){
            System.out.println("NO");
            return;
        }
        int n = s1.length();
        int i = 0;
        int j = n - 1;
        while(i < n){
            if(s1.charAt(i) != s2.charAt(j)){
                System.out.println("NO");
                return;
            }
            i++;
            j--;
        }
        System.out.println("YES");
    }
}
