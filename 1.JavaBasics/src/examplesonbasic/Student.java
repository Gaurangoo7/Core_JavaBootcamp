/*Object and Class Example: main within class
In this example, we have created a Student class that have two data members id and name. 
We are creating the object of the Student class by new keyword and printing the objects value.
*/
package examplesonbasic;

class Student{  
	 int id;//field or data member or instance variable  
	 String name;  
	  
	 public static void main(String args[]){  
	  Student s1=new Student();//creating an object of Student  
	  System.out.println(s1.id);//accessing member through reference variable  
	  System.out.println(s1.name);  
	 }  
	}  