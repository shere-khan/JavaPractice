package justin.cert.species;

public class Cat extends DomesticAnimal {
	public String name;
	
	public Cat() {
		type = "Cat";
		caged = false;
		name = "Bob";
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "\na cat";
	}
}
