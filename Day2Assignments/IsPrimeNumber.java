package week_1.Day2Assignments;

public class IsPrimeNumber {//Cls Name

    public static void main(String[] args) {

        int input = 13;   // given number
        boolean isPrime = true;

        // numbers less than 2 are not prime
        if (input <= 1) {
            isPrime = false;
        } else {
            // check divisibility from 2 to n-1
            for (int i = 2; i <= input - 1; i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(input + " is a Prime number");
        } else {
            System.out.println(input + " is not a Prime number");
        }
    }
}

