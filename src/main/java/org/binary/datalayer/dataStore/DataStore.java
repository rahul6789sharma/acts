package org.binary.datalayer.dataStore;

import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import org.binary.datalayer.models.Aircrfat;
import org.binary.datalayer.models.AircrfatComparator;
import org.binary.datalayer.models.AircrfatSize;
import org.binary.datalayer.models.AircrfatType;

public class DataStore {

	// Creating empty PriorityBlockingQueue queue
	// can be used in multiThreaded Environment
	private static BlockingQueue<Aircrfat> acQueue = new PriorityBlockingQueue<>(1000, new AircrfatComparator());

	static int autIncrementID = 7;

	public static Queue<Aircrfat> getAcQueue() {
		return acQueue;
	}

	public static Aircrfat removeAirCraft() {
		return acQueue.poll();
	}

	public static Set<Aircrfat> printAirCrafts() {

		Set<Aircrfat> set = new TreeSet<>(new AircrfatComparator());
		Iterator<Aircrfat> itr = acQueue.iterator();
		while (itr.hasNext()) {
			set.add(itr.next());
		}
		return set;
	}

	public static void addAircraft(Aircrfat aircrfat) {
		aircrfat.setId(autIncrementID++);
		acQueue.add(aircrfat);
	}

	/************************************************/
	// loading initial sample Data
	static {
		Aircrfat aircrfat4 = new Aircrfat();
		aircrfat4.setId(4);
		aircrfat4.setType(AircrfatType.VIP);
		aircrfat4.setSize(AircrfatSize.Large);

		Aircrfat aircrfat1 = new Aircrfat();
		aircrfat1.setId(1);
		aircrfat1.setType(AircrfatType.Emergency);
		aircrfat1.setSize(AircrfatSize.Small);

		Aircrfat aircrfat3 = new Aircrfat();
		aircrfat3.setId(3);
		aircrfat3.setType(AircrfatType.VIP);
		aircrfat3.setSize(AircrfatSize.Small);

		Aircrfat aircrfat2 = new Aircrfat();
		aircrfat2.setId(2);
		aircrfat2.setType(AircrfatType.Emergency);
		aircrfat2.setSize(AircrfatSize.Large);

		Aircrfat aircrfat5 = new Aircrfat();
		aircrfat5.setId(5);
		aircrfat5.setType(AircrfatType.Cargo);
		aircrfat5.setSize(AircrfatSize.Large);

		Aircrfat aircrfat6 = new Aircrfat();
		aircrfat6.setId(6);
		aircrfat6.setType(AircrfatType.Cargo);
		aircrfat6.setSize(AircrfatSize.Large);

		Aircrfat aircrfat7 = new Aircrfat();
		aircrfat7.setId(7);
		aircrfat7.setType(AircrfatType.Passenger);
		aircrfat7.setSize(AircrfatSize.Large);

		acQueue.add(aircrfat6);
		acQueue.add(aircrfat5);
		acQueue.add(aircrfat7);
		acQueue.add(aircrfat1);
		acQueue.add(aircrfat2);
		acQueue.add(aircrfat4);

		acQueue.add(aircrfat3);
	}
}
