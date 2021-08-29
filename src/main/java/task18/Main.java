package task18;

import org.apache.commons.math3.primes.Primes;



public class Main {
    public static void main(String[] args){
        printPrime(args);
    }

    public static void printPrime(String[] arrStr) {

        for (int i = 0; i < arrStr.length; i++) {
            try {
                if (Primes.isPrime(Integer.parseInt(arrStr[i]))) {
                    System.out.println(arrStr[i] + " - prime");
                } else {
                    System.out.println(arrStr[i] + " - not prime");
                }
            } catch (NumberFormatException e) {
                System.out.println(arrStr[i] + " - NOT A NUMBER");
            }
        }
    }
}
