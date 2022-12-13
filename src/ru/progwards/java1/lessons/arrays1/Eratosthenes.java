package ru.progwards.java1.lessons.arrays1;

public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int n) {
        sieve = new boolean[n];
        for (int i = 0; i < n; i++) {
            sieve[i] = true;
        }
        sift();
    }

    private void sift() {
        for (int i = 2; i * i < sieve.length - 1; i++) {
            for (int j = i * i; j < sieve.length; j = j + i) {
                sieve[i] = false;
            }

        }

    }

    public boolean isSimple(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Eratosthenes e = new Eratosthenes(1000);
      /*  for (int i = 0; i < e.sieve.length; i++) {
            //System.out.println(e.sieve[i]);
        }*/
        System.out.println(e.isSimple(5));
    }
}