package java_oops_dsa.java_dsa.number_theory.PrimeFactorization;

public class PrimeFactorization {

    static void primeFactorization(int n) {

        for (int i = 2; i * i <= n; i++) {

            while (n % i == 0) {

                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If something is left, it is a prime factor
        if (n > 1) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {

        int n = 60;

        System.out.print("Prime factors of " + n + ": ");

        primeFactorization(n);
    }
}