package day14;

//hierarchy
class Parent{

	void display (int a) {
		System.out.println(a);
	}
}

	class Child1 extends Parent{

		void show(int b) {
			System.out.println(b);
		}
	}
	class Child2 extends Parent{

		void print(int b) {
			System.out.println(b);
		}
	}


public class HierarchyInheritance {

	public static void main(String[] args) {

		Child1 c1= new Child1();
		c1.display(10);
		c1.show(12);
		
		Child2 c2= new Child2();
		c2.display(20);
		c2.print(13);
		

	}

}
