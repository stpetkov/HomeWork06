package Task65;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in celsius: ");
		double celsius = sc.nextDouble();
		System.out.print("The temperature in farenheit is " + (32 + celsius * 1.8) + " degrees");
		sc.close();
	}
}
