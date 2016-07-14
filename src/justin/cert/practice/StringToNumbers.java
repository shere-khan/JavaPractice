package justin.cert.practice;

public class StringToNumbers {

	public static void main(String[] args) {
		String sum = "2.5f + 3.4f";
		
		System.out.println("Question: " + sum);
		
		String[] nums = sum.split(" \\+ ");
		
		float f1 = Float.valueOf(nums[0]).floatValue();
		float f2 = Float.valueOf(nums[1]).floatValue();
		
		float answer = f1 + f2;
		System.out.println("answer: " + answer);
		
		
		System.out.println(Float.valueOf("6.5f"));
	}
}
