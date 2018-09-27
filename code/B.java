package main.java;

public class B extends A {
	public int k() {
		return 42;
	}
	
	public int m() {
		return super.k(); 
	}
}