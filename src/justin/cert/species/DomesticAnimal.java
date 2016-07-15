package justin.cert.species;

public class DomesticAnimal extends Animal {
	public boolean caged;
	
	@Override
	public String getDescription() {
		return "\nA domestic animal";
	}
}
