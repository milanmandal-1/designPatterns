package design;

public class EmployeeFactory{

public static Employee getEmployee(EmployeeAbstractFactory factory) {

	return factory.getEmployee();

  }
}