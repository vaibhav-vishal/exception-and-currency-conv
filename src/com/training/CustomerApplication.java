package com.training;

public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cust1 = new Customer();
		cust1.setCustomerId(101);
		cust1.setCustomerName("anirudh");
		cust1.setEmail_Id("ani@abc.com");
		cust1.setHandPhone(93115);
		
		System.out.println(cust1.showCustomer());
//		Customer cust2 = new Customer(102,"shubham","shub@abc.com",98115);
	//	System.out.println(cust2.showCustomer());
		
	}

}
