//(&& || !).
package week_1.Day2;

public class LogicalOperators {

	public static void main(String[] args) {
		int age=20;
		boolean Female= true;
		System.out.println("check the age and gender is female"+" "+(age>30 && Female));
		System.out.println("check the age and gender is female"+" "+(age>25 || Female));
		System.out.println("check the age"+" "+(age>18));
		System.out.println("check the age"+" "+!(age>18));
		

	}

}
