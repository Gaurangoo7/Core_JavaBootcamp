/*Object and Class Example: main outside class
	In real time development, we create classes and use it from another class.
	We can have multiple classes in different java files or single java file. 
	If you define multiple classes in a single java source file, it is a good idea to save the file name with the class name which has main() method.
	*/
package examplesonbasic;

class TestStudent1{  
	 int id;  
	 String name;  
	}  
	class Student1{  
	 public static void main(String args[]){  
		 TestStudent1 s1=new TestStudent1();  
	  System.out.println(s1.id);  
	  System.out.println(s1.name);  
	 }  
	}  
	
	
	