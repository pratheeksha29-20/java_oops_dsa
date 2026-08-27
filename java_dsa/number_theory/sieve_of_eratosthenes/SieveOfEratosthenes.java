package java_oops_dsa.java_dsa.number_theory.sieve_of_eratosthenes;

import java.util.*;

public class SieveOfEratosthenes {

    // Returns a boolean array where:
    // true  -> prime
    // false -> not prime
    static boolean[] sieve(int n) {

        boolean[] isPrime = new boolean[n];

        Arrays.fill(isPrime, true);

        if (n > 0) {
            isPrime[0] = false;
        }

        if (n > 1) {
            isPrime[1] = false;
        }

        for (int i = 2; i * i < n; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean[] isPrime = sieve(n);

        System.out.println("Prime numbers below " + n + ":");

        for (int i = 2; i < n; i++) {

            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}