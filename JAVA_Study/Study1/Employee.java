public class Employee 
{
	private static int totalCount;
	private final static String company_name = "TechCorp";
	private int employeeId;
	private String name;
	private double salary;
	private Employee manager;
	private String subordinates[] = new String[10];

	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	Employee(String name, double salary, Employee manager)
	{
		Employee(String name, double salary);
	}

	public int getTotalCount()
	{
		return totalCount;
	}
	public String getCompanyName()
	{
		return company_name;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public Employee getManager()
	{
		return manager;
	}
	public String[] getSubordinates()
	{
		return subordinates;
	}

	public void setSalary(double s)
	{
		salary = s;
	}

	public static void addSubbordinate(Employee emp)
	{
		
	}

	
}
