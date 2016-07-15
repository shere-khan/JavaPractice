package justin.cert.practice;

public class Main {
	public static void main(String[] args) {
		Static s = new Static();
		System.out.println(s.anInt);
		System.out.println(s.aString);
		
		System.out.println(Static.HELLO);
		System.out.println(Static.NUM);
		
		MountainBike mb = new MountainBike(10, 0, 3, 4);
	}
}
