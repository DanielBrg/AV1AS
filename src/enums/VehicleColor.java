package enums;

public enum VehicleColor {
	WHITE(1), RED(2);
	
	private final int color;

	VehicleColor(int color) {
		this.color = color;
	}
	
	public int getValue() {
		return this.color;
	}
	
}
