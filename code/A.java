package main.java;

public class A {
	class B { 
		public int getTamanho() { 
			return 23; 
		} 
	}
	public int m() { 
		return new B().getTamanho(); 
	}
}