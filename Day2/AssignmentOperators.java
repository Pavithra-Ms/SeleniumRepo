/*
 * Perform in order:
assign value
add 5
subtract 3
multiply by 2
divide by 4
 */
package week_1.Day2;

public class AssignmentOperators {

	public static void main(String[] args) {
		int a=25;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a-3);
		System.out.println(a*5);
		System.out.println(a/5);
		
		a+=5;
		System.out.println(a);

	}

}
