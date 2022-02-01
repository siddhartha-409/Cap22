package day3assignments;

class Fruit{
	
	String name;
	String taste;
	int size;
	
	void eat() {
		System.out.println("Fruit is fruity");
	}
}

class Apple extends Fruit{
	
	String name;
	String taste;
	int size;
	
	void eat() {
		System.out.println("Apple is sweet");
	}
}

class Orange extends Fruit{
	
	String name;
	String taste;
	int size;
	
	void eat() {
		System.out.println("Orange is sour");
	}
}


public class FruitTaste {
	
	public static void main(String args[]) {
		
		Orange o = new Orange();
		o.eat();
		Apple a = new Apple();
		a.eat();
	}

}
