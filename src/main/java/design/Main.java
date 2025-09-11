package design;

public class Main {
	public static void main(String[] args) {

		Apple apple = Apple.getApple();
		System.out.println(apple.hashCode());

		Apple apple_Juice = Apple.getApple();
		System.out.println(apple_Juice.hashCode());

		Orange orange = Orange.getOrange();
		System.out.println(orange.hashCode());
		System.out.println(orange);

		Orange orange_juice = Orange.getOrange();
		System.out.println(orange_juice.hashCode());
		System.out.println(orange);
	}
}