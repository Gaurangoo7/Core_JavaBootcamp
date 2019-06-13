
public class Example1 {

	int a ;
	float b;
	String str;
	public void operation1(){
		a=10; 
		b=(float) 10.5;
		str = "Gaurang";
		}
	
	public void operation2() {
		a=20;
		b=(float)25.21;
		str = "Shah";
		}
	public void display(){
		System.out.println("The integer is:"+a);
		System.out.println("The Float is:"+b);
		System.out.println("The String is:"+str);
		
		logger.console("Welcome to Java Learning");
		
	}
}

class mainClass {

	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.operation1();
		

	}
}

