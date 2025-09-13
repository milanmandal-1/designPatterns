package design;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Getting WebDeveloper Salary");
		return 50000;
	}

}
