package org.binary.datalayer.models;

/**
 * @author rahulksh
 *
 */
public enum AircrfatSize {

	Large(1), Small(2);
	private int value;

	private AircrfatSize(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
