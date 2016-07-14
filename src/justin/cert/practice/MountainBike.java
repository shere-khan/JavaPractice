package justin.cert.practice;

public class MountainBike extends Bicycle {

	public int seatHeight;
	
	public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
}
