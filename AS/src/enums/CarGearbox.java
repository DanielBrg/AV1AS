package enums;

public enum CarGearbox {
	AUTOMATIC("CG1");
	
	private final String type;

	CarGearbox(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.type;
	}
}
