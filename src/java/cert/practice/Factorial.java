package java.cert.practice;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int x = s.nextInt();
			System.out.println(factorial(x));
		}
	}

	public static int factorial(int n) {
		if (n == 1)
			return n;
		return n * factorial(n - 1);
	}
}
