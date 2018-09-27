package main.java;

public class C extends B {

	public int test() {
		return m();
	}
	
	public int m() {
		return super.k(); 
	}

}