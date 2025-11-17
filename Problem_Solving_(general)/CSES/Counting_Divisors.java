package CSES;

import java.util.Scanner;

// Java code (TLE)

public class Counting_Divisors {
    static long[] divisor = new long[1000001];;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        calculate();
        while(t-- > 0) solve(sc);
    }

    private static void calculate() {
       for(int i = 1; i < divisor.length; i++){
            for(int j = i; j < divisor.length; j+=i){
                divisor[j]++;
            }
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        
        System.out.println(divisor[n]);
    }
}

// C++ (Accepted)

// #include <bits/stdc++.h>
// using namespace std;
 
// static long long divisor[1000001];
 
// void calculate() {
//     for (int i = 1; i < 1000001; i++) {
//         for (int j = i; j < 1000001; j += i) {
//             divisor[j]++;
//         }
//     }
// }
 
// void solve() {
//     int n;
//     cin >> n;
//     cout << divisor[n] << "\n";
// }
 
// int main() {
//     ios::sync_with_stdio(false);
//     cin.tie(nullptr);
 
//     int t;
//     cin >> t;
 
//     calculate();
 
//     while (t--) solve();
 
//     return 0;
// }
