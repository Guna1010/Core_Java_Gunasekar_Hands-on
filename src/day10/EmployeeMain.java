package day10;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		

	}

}
