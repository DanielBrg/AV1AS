package enums;

public enum MotoModel {
	SPORT("MM1");
	
	private final String model;

	MotoModel(String model) {
		this.model = model;
	}

	public String getValue() {
		return this.model;
	}
}
