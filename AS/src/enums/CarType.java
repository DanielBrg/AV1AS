package enums;

public enum CarType {
	COUPE("CT1");
	
	private final String type;

	CarType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.type;
	}
}
