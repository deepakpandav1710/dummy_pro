package com.javatpoint;

public class Account11 {

	public static void main(String[] args) 
	{
		Account a = new Account();
		
		//System.out.println(a.getAcco_no()+" "+a.getName()+" "+a.amount());
		a.acco_no(123456789);
		a.name("Deepak Pandav");
		a.amount(34000f);
		
		System.out.println(a.acco_no()+" "+a.name()+" "+a.amount());

	}

}
