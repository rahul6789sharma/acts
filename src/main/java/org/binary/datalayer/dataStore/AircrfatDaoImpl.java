package org.binary.datalayer.dataStore;

import java.util.Set;

import org.binary.datalayer.models.Aircrfat;

public class AircrfatDaoImpl implements Dao<Aircrfat> {

	@Override
	public Aircrfat get(int id) throws ATCSDataException {
		Aircrfat ac = DataStore.getAcQueue().poll();
		if (ac != null) {
			return DataStore.getAcQueue().poll();
		} else {
			throw new ATCSDataException("Data Not found");
		}

	}

	@Override
	public Set<Aircrfat> getAll() throws ATCSDataException {
		Set<Aircrfat> acs = DataStore.printAirCrafts();
		if (acs != null && !acs.isEmpty()) {
			return DataStore.printAirCrafts();
		} else {
			throw new ATCSDataException("Data Not found");
		}
	}

	@Override
	public void save(Aircrfat t) throws ATCSDataException {
		try {
			DataStore.addAircraft(t);
		} catch (Exception e) {
			throw new ATCSDataException("Error in Saving Aircrfat " + e.getMessage());
		}
	}

	@Override
	public Aircrfat removeHigestPriorityAircraft() throws ATCSDataException {

		try {
			return DataStore.removeAirCraft();
		} catch (Exception e) {
			throw new ATCSDataException("Error in Saving Aircrfat ");
		}
	}

}
