package enums;

public enum MotoType {
	CUSTOM("MT1");
	
	private final String type;

	MotoType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.type;
	}
}
