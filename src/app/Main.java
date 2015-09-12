package app;

import java.util.ArrayList;

import entities.Specification;
import entities.Store;
import entities.Vehicle;
import enums.CarGearbox;
import enums.CarModel;
import enums.CarType;
import enums.MotoModel;
import enums.MotoType;
import enums.VehicleColor;
import enums.VehicleMaker;
import enums.VehicleType;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.addSpecification("tipoVeiculo", VehicleType.CAR)
			.addSpecification("chassi", "000001")
			.addSpecification("cor", VehicleColor.RED)
			.addSpecification("montadora", VehicleMaker.CHEVROLET)
			.addSpecification("modelo", CarModel.ADVENTURE)
			.addSpecification("tipo", CarType.COUPE)
			.addSpecification("motorizacao", 2.0)
			.addSpecification("cambio", CarGearbox.AUTOMATIC);

		Vehicle moto = new Vehicle();
		moto.addSpecification("tipoVeiculo", VehicleType.MOTO)
			.addSpecification("chassi", "000002")
			.addSpecification("cor", VehicleColor.RED)
			.addSpecification("montadora", VehicleMaker.DUCATI)
			.addSpecification("modelo", MotoModel.SPORT)
			.addSpecification("tipo", MotoType.CUSTOM)
			.addSpecification("cilindradas", 1000)
			.addSpecification("capacidadeTanque", 15);

		Store store = new Store("Nome", "Endereco");
		store.addVehicle(car).addVehicle(moto);
		
		Specification param = new Specification();
		param.addProperty("cor", VehicleColor.RED);
		//param.addProperty("tipoVeiculo", VehicleType.CAR);
		
		ArrayList<Vehicle> res = store.search(param);
		System.out.println(res);
		
		Vehicle v = store.searchBy("chassi", "000002");
		System.out.println(v);
	}

}
