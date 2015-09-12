package entities;

public class Vehicle {
	
	Specification specification;
	
	public Vehicle() {
		specification = new Specification();
	}
	
	public Vehicle addSpecification(String key, Object value) {
		specification.addProperty(key, value);
		return this;
	}
	
	public Specification getSpecification() {
		return specification;
	}
	
}
