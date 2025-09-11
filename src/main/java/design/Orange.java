package design;

public class Orange {

	private static Orange orange = new Orange();

	// Eager way of Initialization
	public static Orange getOrange() {
		return orange;
	}
}