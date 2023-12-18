package com.activetime.baseclass;

import java.io.IOException;

public class Demoexceldataoutputs {

	public static void main(String[] args) throws IOException, Throwable {
		
		Excellibray ex=new Excellibray();
	String ex1=	ex.getExcelData("Login", 1, 0);
	System.out.println(ex1);
	
	String ex2=	ex.getExcelData("Login", 1, 3);
	System.out.println(ex2);
		
		// TODO Auto-generated method stub

	}

}
