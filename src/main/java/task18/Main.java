package task18;

import org.apache.commons.math3.primes.Primes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String checkPrimeStr = reader.readLine();

        printPrime(checkPrimeStr);
    }

    public static void printPrime(String str) {
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            try {
                if (Primes.isPrime(Integer.parseInt(strArr[i]))) {
                    System.out.println(strArr[i] + " - prime");
                } else {
                    System.out.println(strArr[i] + " - not prime");
                }
            } catch (NumberFormatException e) {
                System.out.println(strArr[i] + " - NOT A NUMBER");
            }
        }
    }
}
