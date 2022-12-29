package com.boot.init.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FuelTank {
	private String FuelType;
	private int Capacity;
	@Value("${fuelType}")//("diesel")
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}
	@Value("${capacity}") //$ use for change value
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	@Override
	public String toString() {
		return "FuelTank [FuelType=" + FuelType + ", Capacity=" + Capacity + "]";
	}
}

	