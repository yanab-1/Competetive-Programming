package CSES;

import java.util.Scanner;

public class Palindrome_Reorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'A']++;
        }
        StringBuilder sb = new StringBuilder();
        int odd = 0;
        int middle = -1;
        for(int i = 0; i < 26; i++){
            if(freq[i] % 2 != 0) {
                odd++;
                if(odd > 1){
                    System.out.println("NO SOLUTION");
                    return;
                }
                middle = i;
            }
            for(int j = 0; j < freq[i] / 2; j++){
                sb.append((char) (i + 'A'));
            }
        }

        System.out.print(sb.toString());
        if(middle != -1){
            System.out.print((char) (middle + 'A'));
        }
        System.out.println(sb.reverse().toString());
    }
}
