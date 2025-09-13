package design;

public class DeveloperClient {

	public static void main(String[] args) {

		Employee emp = EmployeeFactory.getEmployee("Android Developer");
		int salary = emp.salary();
		System.out.println(salary);
	}
}