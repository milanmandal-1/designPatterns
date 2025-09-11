package design;

public class Apple {

	private static Apple apple;

	private Apple() {

	}

	// Lazy Initialization
	public static synchronized Apple getApple() {

		if (apple == null) {
			apple = new Apple();
		}
		return apple;
	}
}