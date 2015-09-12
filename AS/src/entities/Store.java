package entities;

import java.util.ArrayList;

public class Store {

	private String name;
	private String address;
	private ArrayList<Vehicle> vehicles;
	private ArrayList<Vehicle> results;

	public Store(String name, String address) {
		this.name = name;
		this.address = address;
		this.vehicles = new ArrayList<Vehicle>();
		this.results = new ArrayList<Vehicle>();
	}

	protected ArrayList<Vehicle> search(Specification spec, boolean single) {
		this.results.clear();
		if (!this.vehicles.isEmpty()) {
			for (Vehicle vehicle : this.vehicles) {
				if (vehicle.getSpecification().contains(spec)) {
					results.add(vehicle);
					if (single) {
						return results;
					}
				}
			}
		}
		return results;
	}

	public ArrayList<Vehicle> search(Specification spec) {
		return search(spec, false);
	}

	public Vehicle searchBy(String key, String value) {
		search(new Specification().addProperty(key, value), true);
		return !this.results.isEmpty() ? this.results.get(0) : null;
	}

	public Store addVehicle(Vehicle v) {
		this.vehicles.add(v);
		return this;
	}

	public ArrayList<Vehicle> getVehicles() {
		return this.vehicles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
