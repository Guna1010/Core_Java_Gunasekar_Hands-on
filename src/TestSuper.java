package day15;

class Animal {

	String color= "White";	

	void eat() {

		System.out.println("eating egg");
	}

}
class Dog extends Animal{

	String color= "black"; //overrided here

	void displaycolor() {
		System.out.println(super.color); //invoking parent variable

	}
	void eat() {

		//System.out.println("eating bread");
		super.eat();         
	}

}
public class TestSuper{
	public static void main (String[] args) {
		Dog d = new Dog();

		d.displaycolor();
		d.eat();

	}
}