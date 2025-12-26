package day11;

public class GreetingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greetings gr= new Greetings();
		gr.m1();  //1)
		String M2= gr.m2(); //2)
		System.out.println(M2);
		gr.m3("m3 method"); //3)		
		String M4=gr.m4("m4");
		System.out.println(M4);
		
	}

}
