package com.training.myexceptions;
//inheritance
//checked exception -because extending exception
public class RangeCheckException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private long handPhone;
//mandatory dependency
public RangeCheckException(long handphone) {
	super();
	this.handPhone = handphone;
}
//overriding super class method
@Override
public String getMessage() {
	return handPhone+" should me of 10 digits";
}

	
}

