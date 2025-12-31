package day14;



//in one class only one class should be public (ie., main method) other should be default

//single inheritance

class A{

	int a=100;
	void dislpay() {
		System.out.println(a);
	}
}

class B extends A{

	int b=200;
	void show() {
		System.out.println(b);
	}
}

//multilevel
class C extends B{
	int c=300;
	void print() {
		System.out.println(c);
	}

}

public class InheritanceTypes {  //note this---public comes here ony
	public static void main(String[] args) {
		//Single
		B objb= new B();
		System.out.println(objb.a);
		objb.dislpay();

		System.out.println(objb.b);
		objb.show();

		//multilevel
		C objc= new C();
		System.out.println(objc.a);		
		System.out.println(objc.b);
		System.out.println(objc.c);
		objc.dislpay();
		objc.show();
		objc.print();
	}

}
