package day13;

public class Staticdemo {

	static int a=10;
	int b=20;


	static void m1() {
		System.out.println("m1 method-static");
	}
	void m2() {
		System.out.println("m2 method -non static");
		
	}
  void m3() {
	  System.out.println(a);
	  System.out.println(b);
	  m1();
	  m2();
	  
  }
	/*
  public static void main(String [] args) {
		//System.out.println(a);   //static variable accessing directly from static method
		//
		m1();  //static method is accessing directly from static method without creating object reference
		//Staticdemo sd= new Staticdemo();
		//sd.m2();
		//System.out.println(sd.b);
		
		Staticdemo sd= new Staticdemo();
		sd.m3();

	}
	*/
}




