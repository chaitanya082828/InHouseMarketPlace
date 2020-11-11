package com.cg.InHouseMarketPlace.exception;

public class InvalidOfferException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidOfferException()
	{
		super();
	}
	public InvalidOfferException(String message, Throwable cause) 
	{
		super(message, cause);
	}

	public InvalidOfferException(String message) 
	{
		super(message);
	}

	public InvalidOfferException (Throwable cause) 
	{
		super(cause);
	}
}	