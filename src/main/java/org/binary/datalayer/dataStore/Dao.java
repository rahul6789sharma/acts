package org.binary.datalayer.dataStore;

import java.util.Set;

public interface Dao<T> {

	T get(int id) throws ATCSDataException;

	Set<T> getAll() throws ATCSDataException;

	void save(T t) throws ATCSDataException;

	T removeHigestPriorityAircraft() throws ATCSDataException;

}
