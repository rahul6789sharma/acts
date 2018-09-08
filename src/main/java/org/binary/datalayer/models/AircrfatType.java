package org.binary.datalayer.models;

/**
 * @author rahulksh
 *
 */
public enum AircrfatType {

	Emergency(1), VIP(2), Passenger(3), Cargo(4);
	private int value;

	private AircrfatType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
