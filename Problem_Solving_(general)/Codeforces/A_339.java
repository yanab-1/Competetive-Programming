package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A_339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] parts = s.split("\\+");

        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append("+").append(arr[i]);
        }

        System.out.println(sb.toString());
    }
}
