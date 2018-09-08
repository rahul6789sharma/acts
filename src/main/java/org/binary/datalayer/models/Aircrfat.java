package org.binary.datalayer.models;

import java.io.Serializable;

/**
 * @author rahulksh
 *
 */
public class Aircrfat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private AircrfatType type;
	private AircrfatSize size;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AircrfatType getType() {
		return type;
	}

	public void setType(AircrfatType type) {
		this.type = type;
	}

	public AircrfatSize getSize() {
		return size;
	}

	public void setSize(AircrfatSize size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Aircrfat [id=" + id + ", type=" + type + ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aircrfat other = (Aircrfat) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
