package constructureDemo;

public class Student {
	int sid;
	String sname,email;
	long phone;
void student()   // As constructor doesnt have return type so this is method
{
System.out.println("Method student()");	
}
Student()
{
System.out.println("Default Constructor");	
}
Student(int id,String name,String em)
{
System.out.println("3 parameter constructor");
sid=id; 
sname=name; 
email=em;
}
String show()
{
System.out.println(sid);	
System.out.println(sname);
System.out.println(email);
System.out.println(phone);
return "Gaurang"; 
}
}
