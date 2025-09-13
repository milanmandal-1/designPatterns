package design;

public class DeveloperClient {

	public static void main(String[] args) {

		Employee emp = EmployeeFactory.getEmployee(new AndroidDevFactory());
		int salary = emp.salary();
		System.out.println(salary);

		Employee emp1 = EmployeeFactory.getEmployee(new WebDevFactory());
		String dev= emp1.name();
		System.out.println(dev);


	}
}