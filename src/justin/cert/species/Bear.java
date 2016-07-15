package justin.cert.species;

public class Bear extends WildAnimal {
	public int weightInKg;
	
	public Bear() {
		type = "Bear";
		habitat = "Forst";
		weightInKg = 300;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "\na bear";
	}
	
	public static void main(String[] args) {
		Bear bear = new Bear();
		System.out.println(bear.getDescription());
	}
}
