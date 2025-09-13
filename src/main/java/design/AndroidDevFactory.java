package design;

public class AndroidDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee getEmployee() {

		return new AndroidDeveloper();

	}
}