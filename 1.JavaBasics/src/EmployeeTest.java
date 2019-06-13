
public class EmployeeTest {

	public static void main (String [] args) {
		
		Employee emp = new Employee();
		emp.setId("1"); // Public method can be access outside the class
		System.out.println("emp.getId()  " +emp.getId());
		
		
	}
}
