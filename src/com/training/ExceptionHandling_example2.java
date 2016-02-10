package com.training;

@SuppressWarnings("serial")
public class ExceptionHandling_example2 extends Exception {
public static void main(String[] args) {
	try{
		String age=null;
		int age2 =Integer.parseInt(age);
		System.out.println(++age2);
	}catch(NumberFormatException |NullPointerException e)
	{
		if(e instanceof NumberFormatException)
		{	System.out.println(e.getMessage()+"\nAge should be integer value");
		}else{
			System.out.println(e.getMessage()+" Age cant be null");
	}
	}
}
}
