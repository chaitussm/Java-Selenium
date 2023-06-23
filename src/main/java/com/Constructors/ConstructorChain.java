package com.Constructors;

public class ConstructorChain {
	
	ConstructorChain(){
		
		this(5);
		System.out.println("This is Default Constructor");
		
	}
	
	ConstructorChain(int x){
		
	  this(5,15);	
	  
	  System.out.println(x);
	}
	
	ConstructorChain(int x, int y){
		
		System.out.println(x * y );
	}
	

	public static void main(String[] args) {

		new ConstructorChain();
	}

}
