package day11;

public class StudentMain {

	public static void main (String[] args) {

		/*
		Student stu= new Student();

		//approach 1) store data using object reference

		stu.sid=1234;
		stu.sname="Guna";
		stu.grade='A';
		//stu.printStudentData();
		 */
		/*
		//approach2) create one user defined method and pass values to the local variable and re assign to the class variable

		stu.setStudentData(555, "Sekar", 'A');
		stu.printStudentData();	
		 */
		//approach 3)using contructor

		//--no need to call contructor explicitely like method. at the time of creating object, its automatically executed 
		//for parameteried contructor-- we have to create object and pass the values as parameter
		Student stu= new Student(555, "Sekar", 'A');
		stu.printStudentData();
	}

}
















