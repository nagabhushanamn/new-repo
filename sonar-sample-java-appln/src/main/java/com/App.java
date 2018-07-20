package com;

public class App {
	

	public static int getLen() {
		String item=null;
		if(item==null)
			return item.length();
		else
			return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("hello sonar");
		int v=12;
		System.out.println(getLen());
		
		String var="after lunch";
		
	}

}
