package com.training;

import com.training.myexceptions.RangeCheckException;

public class ExceptionApplication {
public static void main(String[] args) {
	try {
		@SuppressWarnings("unused")
		Customer cust = new Customer(101, "aman", "aman@abc.com", 9987897654L);
	} catch (RangeCheckException e) {
		
		
			System.out.println(e.getMessage());
	
	
	}
finally{
	System.out.println("Inside finally");
}

System.out.println("Byebye");

}
}
