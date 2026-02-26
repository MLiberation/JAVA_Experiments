
public class EmployeeReferenceTests
{
    public static void testReferenceAssignment() 
	{
		Employee emp1 = new Employee("John Smith",120.000);
		Employee emp2 = emp1;

		System.out.println("Employee class is loaded for TechCorp");
		System.out.println("Initializing employee");
		System.out.println(emp1);
		System.out.println(emp2);

		if(emp1.equals(emp2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		emp2.setSalary(60.000);
		System.out.println(emp1.getSalary());
    }

    public static void main(String[] args) 
	{
		testReferenceAssignment();
    }
}
