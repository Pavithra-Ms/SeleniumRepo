package week_1.Day2Assignments;

public class IsPalindrom {
	    public static void main(String[] args) {

	        int input = 12345;   // given number
	        int output = 0;
	        int rem;

	        // for loop to reverse the number
	        for (int i = input; i > 0; i = i / 10) {
	            rem = i % 10;
	            output = output * 10 + rem;
	        }

	        // check palindrome
	        if (input == output) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome");
	        }
	    }
	}
