package day13;

public class PassingParameterstoMainMethod {

	public static void main(String[] args) {
		
		
		//these details should give in run as confirgure under arguments colums
//		args[0]= "welcome";
//		args[1]= "to";
//		args[2]= "Java";
//		args[3]="selenium";
		
		
		System.out.println(args.length);
		
		for(String    s:args) {
			
			System.out.println(s);
		}
		
		

	}

}
