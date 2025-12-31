package day15;

class Test1{

	final void m1() {
		System.out.println("test1");
	}
}


class Test2 extends Test1{

	void m1() {   // we can't override from parent as method being final
		System.out.println("test1--implementation changed");
	}
}

//making class as final 
final class Test3 {

	void m1(){
		System.out.println("final class method");
	}
}

class Test4 extends Test3{ //cant extend test3
	void m1(){
		System.out.println("final class method");
	}

}

public class FinalKeyword2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.m1();

	}

}
