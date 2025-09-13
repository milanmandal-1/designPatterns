package design;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		return 50000;
	}

	@Override
	public String name() {
		System.out.println("Getting WebDeveloper Salary");
		return "Web Developer";
	}

}
