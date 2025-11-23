package Codeforces;
import java.util.Scanner;

public class B_1617 {
    static void solve(Scanner sc) {
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("2 " + ((n - 1) - 2) + " 1");
        } else {
            int cur = (n - 1) / 2;
            if (cur % 2 == 0) {
                System.out.println((cur - 1) + " " + (cur + 1) + " 1");
            } else {
                System.out.println((cur - 2) + " " + (cur + 2) + " 1");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }
}
