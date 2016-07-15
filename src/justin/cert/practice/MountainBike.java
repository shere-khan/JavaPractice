package justin.cert.practice;

public class MountainBike extends Bicycle {

	public int seatHeight;
	
	public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
		pedalType = 5;
	}

	public int getSeatHeight() {
		return seatHeight;
	}
	
	public int getPedalType() {
		return pedalType;
	}
	
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(10, 0, 2, 3);
		mb.setHeight(5);
		System.out.println("height: " + mb.getSeatHeight());
		
		Bicycle bicycle = new Bicycle(10, 0, 1);
		bicycle.pedalType = 7;
	}
}
