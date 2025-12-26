package day11;

public class Student {
	//class variable
	int sid;
	String sname;
	char grade;

	void printStudentData() {
		System.out.println(sid+" "+sname+" "+grade);

	}
	//id, name, gr--->local variables
	void setStudentData(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grade=gr;

	}
	//contructor --can't return any value (no need to specify void also)
	//class name=contructor name
	//contructor take param like and assign value to class variabe like method
	Student(int id, String name, char gr){
		sid=id;
		sname=name;
		grade=gr;

		//contructor only for assigning values no logic should come inside contructor
      //but method can allow to write logic also 
	}

















}


