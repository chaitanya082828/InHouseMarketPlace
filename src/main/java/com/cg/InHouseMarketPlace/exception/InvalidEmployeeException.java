package com.cg.InHouseMarketPlace.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidEmployeeException extends RuntimeException
{
		private static final long serialVersionUID = 1L;
		public InvalidEmployeeException() {
			super();
		}
		public InvalidEmployeeException(String message, Throwable cause) {
			super(message, cause);
		}

		public InvalidEmployeeException(String message) {
			super(message);
		}

		public InvalidEmployeeException(Throwable cause) {
			super(cause);
		}
}
	

