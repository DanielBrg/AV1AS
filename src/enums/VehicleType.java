package enums;

public enum VehicleType {
	CAR(1), MOTO(2);

	private final int type;

	VehicleType(int type) {
		this.type = type;
	}
	
	public int getValue() {
		return this.type;
	}
	
}
