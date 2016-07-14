package justin.cert.practice;

public class Inheritance {

	public static void main(String[] args) {
		Object obj = new MountainBike(10, 10, 0, 1);
		
		if (obj instanceof MountainBike) {
			MountainBike myBike = (MountainBike) obj;
		}
	}
}
