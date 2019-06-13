
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 gs = new Child(); // Reference of Parent & Object of child :) 
		System.out.println(gs.a);
		System.out.println(gs.b);
		// System.out.println(gs.c);
		gs.m1();
		gs.m2(); // output : Runtime polymorphism - If method name is same then it will call method from  child class
	//	gs.m3();
		
	}

}
