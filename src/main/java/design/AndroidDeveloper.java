package design;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {

		return 40000;

	}

	@Override
	public String name() {
		System.out.println("Getting Android Developer Salary");
		return "Android Developer";
	}
}