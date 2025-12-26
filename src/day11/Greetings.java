package day11;

public class Greetings {
	//1) no param -no return
	void m1(){
		System.out.println("m1 method"); //its just a print statement, 

	}
	//2) no param- return something
	String  m2() {
		return "m2 method";
	}
	
	//3) takes param-no return  (can pass multiple para also)
	
	
	void m3(String name ) {
		System.out.println(name);
	}
	
	//4) takes para- returns value
	
	String m4(String name2) {
		
		return (name2+" method");
	}
	
	
	
}


