import java.util.Arrays;

public class PracticeClass {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(printArray(47)));
	}
	
	public static int [] printArray(int x) {
		int size = x/5 + 1;
		int[] q = new int [size];
		
		for (int i = 0; i < size; i++) {
			q[i] = i * 5;
		}
		return q;
	}
}
