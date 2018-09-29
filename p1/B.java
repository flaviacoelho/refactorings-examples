package main.java.p1;

import main.java.p2.*;

public class B extends A {
  protected long k(  int a){
    return 0;
  }
  public long test(){
    return m();
  }
public long m() {
    return new B().k(2);
  }
}