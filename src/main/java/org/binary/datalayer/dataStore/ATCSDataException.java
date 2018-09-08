package org.binary.datalayer.dataStore;

public class ATCSDataException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String err_msg;
	private int err_code;

	public ATCSDataException(String err_msg) {
		super();
		this.err_msg = err_msg;

	}

	public ATCSDataException(String err_msg, int err_code) {
		super();
		this.err_msg = err_msg;
		this.err_code = err_code;
	}

	public String getErr_msg() {
		return err_msg;
	}

	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	public int getErr_code() {
		return err_code;
	}

	public void setErr_code(int err_code) {
		this.err_code = err_code;
	}

}
