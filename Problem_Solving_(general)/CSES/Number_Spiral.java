package CSES;

import java.util.Scanner;

// Java (TLE)

public class Number_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int row = sc.nextInt();
        int col = sc.nextInt();
        int x = Math.max(row, col);
        long ans = 0;
        if(x % 2 == 0){
            if(row == x){
                ans = (long) x * x - (col - 1);
            }
            else{
                ans = (long) (x - 1) * (x - 1) + row;
            }
        }
        else{
            if(col == x){
                ans = (long) x * x - (row - 1);
            }
            else{
                ans = (long) (x - 1) * (x - 1) + col;
            }
        }
        System.out.println(ans);
    }
}

// C++ (Accepted)

// #include <bits/stdc++.h>
// using namespace std;

// void solve() {
//     long long row, col;
//     cin >> row >> col;

//     long long x = max(row, col);
//     long long ans = 0;

//     if (x % 2 == 0) {
//         if (row == x) {
//             ans = x * x - (col - 1);
//         } else {
//             ans = (x - 1) * (x - 1) + row;
//         }
//     } else {
//         if (col == x) {
//             ans = x * x - (row - 1);
//         } else {
//             ans = (x - 1) * (x - 1) + col;
//         }
//     }

//     cout << ans << "\n";
// }

// int main() {
//     ios::sync_with_stdio(false);
//     cin.tie(nullptr);

//     int t;
//     cin >> t;
//     while (t--) {
//         solve();
//     }

//     return 0;
// }
