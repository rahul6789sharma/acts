package org.binary.datalayer.models;

import java.util.Comparator;

public class AircrfatComparator implements Comparator<Aircrfat> {

	@Override
	public int compare(Aircrfat arg0, Aircrfat arg1) {
		int result = 0;
		if (arg0.getType().getValue() > arg1.getType().getValue()) {
			result = 1;
		} else if (arg0.getType().getValue() == arg1.getType().getValue()) {
			if (arg0.getSize().getValue() > arg1.getSize().getValue()) {
				return 1;
			} else {
				return -1;
			}

		} else {
			result = -1;
		}

		return result;

	}

}
