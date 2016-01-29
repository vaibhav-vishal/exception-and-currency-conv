package com.training;


public class ExceptionHandling_example {

	public static void main(String[] args) {
		String name =null;		
		int len=0;
		try {

			System.out.println(name.length());	
			//System.out.println(args[0]);
			len=name.length();
		} catch (ArrayIndexOutOfBoundsException e) {
			
			
				System.out.println("Use run as to give args");
		}catch (NullPointerException e) {
		System.out.println("attribute name is null");
		}
		System.out.println(len);
	}
}
