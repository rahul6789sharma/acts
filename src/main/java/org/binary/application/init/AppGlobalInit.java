package org.binary.application.init;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.binary.datalayer.dataStore.DataStore;

@Singleton
@Startup
public class AppGlobalInit {

	private boolean initStatus;

	public boolean isInitStatus() {
		return initStatus;
	}

	@PostConstruct
	public void init() {
		System.out.println("Air Traffic Control system  Starting... ");
		System.out.println("number of airCraft in Q: " + DataStore.getAcQueue().size());
	}

	@PreDestroy
	public void stop() {
		System.out.println("Air Traffic Control system  Stoping... ");
	}

}