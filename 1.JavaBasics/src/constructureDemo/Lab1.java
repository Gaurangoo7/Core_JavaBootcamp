package constructureDemo;

public class Lab1 {
	public static void main (String[] args)
	{
		
		Student s1=new Student();  //default constructor
		s1.show();
		Student s2=new Student(101,"Gaurang","gs@gmail.com"); //Parameter constructor
		s2.show(); 
		s1.student(); //Calling normal method
	}

}
