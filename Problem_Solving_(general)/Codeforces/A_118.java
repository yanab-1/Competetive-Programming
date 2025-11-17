package Codeforces;

import java.util.Scanner;

public class A_118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!isVowel(c)){
                sb.append('.').append(c);
            }
        }
        System.out.println(sb.toString());
    }
    private static boolean isVowel(Character c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u' || c == 'y') return true;
        return false;
    }
}
