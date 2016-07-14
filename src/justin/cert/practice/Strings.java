package justin.cert.practice;

public class Strings {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		
		System.out.println("StringBuilder length: " + str.capacity());
		
		System.out.println("\nString: " + str);
		
		str.append("Hello");
		str.append(' ');
		str.append(123);
		str.append(" World!");
		
		System.out.println("\nString: " + str);
		
		str.insert(1, 'x');
		str.insert(3, 'y');
		str.insert(5, 'z');
		
		System.out.println("\nString: " + str);
		
		str.replace(1, 6, "a b c");
		
		System.out.println("\nString: " + str);
		
		str.reverse();

		System.out.println("\nString: " + str);
	}
}
