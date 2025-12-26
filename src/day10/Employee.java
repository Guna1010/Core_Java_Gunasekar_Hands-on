package day10;

public class Employee {

	//class variables--we can access everywhere
	
	int eid;
	String ename;
	String job;
	int sal;
	
	//methods-cant create method inside method
	
    void display(){
	System.out.println(eid);
	System.out.println(ename);
	System.out.println(job);
	System.out.println(sal);
   }
	
	/*public static void main(String[] args) {
	//object should be created only in the main method
		
		Employee emp1= new Employee();
		emp1.eid=10111;
		emp1.ename="Gunasekar";
		emp1.job="HCLtech";
		emp1.sal=12000;
		emp1.display();
		
		System.out.println("-----------------");
		
		Employee emp2= new Employee();
		emp2.eid=1111;
		emp2.ename="Prithi";
		emp2.job="Pims";
		emp2.sal=10000;
		emp2.display();
		
		//main class will be different
		//one 
		
				

	}
	*/

}
