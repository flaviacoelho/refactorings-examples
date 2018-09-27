package main.java;

public class C extends A {
	class B { 
		public int getTamanho() { 
			return 42; 
		} 
	}
	public int test() {
		return new C().m();
		
	}
}