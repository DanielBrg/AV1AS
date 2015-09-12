package enums;

public enum VehicleMaker {
	CHEVROLET(1), DUCATI(2);
	
	private final int maker;

	VehicleMaker(int maker) {
		this.maker = maker;
	}
	
	public int getValue() {
		return this.maker;
	}
}
