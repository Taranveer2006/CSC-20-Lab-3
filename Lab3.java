// Your name here: Taranveer Singh

package Main;

interface Interface1 {
	void sayHello();
	int addnumbers(int a, int b);
}

interface Interface2 {
	default void printMessage(){
		System.out.println("This is the default method from Interface2");
	}
}

interface Interface3 {
	static void showStaticMessage(){
		System.out.println("This is the static method from Interface3");
	}
}

public class Lab3 implements Interface1, Interface2, Interface3 {
	
	@Override 
	public void sayHello() {
		System.out.println("Hello from Interface1 implemtation");
	}
	
	@Override 
	public int addnumbers(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args) {
		Lab3 obj = new Lab3();
		
		obj.sayHello();
		int sum = obj.addnumbers(3, 5);
		System.out.println("Sum from Interface1 method:" + sum);
		
		obj.printMessage();
		
		Interface3.showStaticMessage();
	}
}