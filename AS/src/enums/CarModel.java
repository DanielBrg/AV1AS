package enums;

public enum CarModel {
	ADVENTURE("CM1");
	
	private final String model;

	CarModel(String model) {
		this.model = model;
	}

	public String getValue() {
		return this.model;
	}
	
}
