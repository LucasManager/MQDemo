package com.apl.convert.exception;

import com.apl.convert.common.BaseBean;

public class DataException extends Exception{

	public DataException() {
		super();
	}
	
	public DataException(String message , Throwable cause){
		super(message, cause);
	}
	
	public DataException(String message){
		super(message);
	}
	
	public DataException(Throwable cause){
		super(cause);
	}

}
