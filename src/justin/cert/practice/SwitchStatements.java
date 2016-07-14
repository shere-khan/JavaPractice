package justin.cert.practice;

public class SwitchStatements {
	public static void main(String[] args) {
		// int m = 8;
		String m = "what";
		String mn;
		switch (m) {
			case "what":
				String r = "here";
				mn = "January";
			case "when":
				System.out.println("hello");
				// String r = "what";
			default:
				mn = "September";
		}
		System.out.println(mn);
	}
}
