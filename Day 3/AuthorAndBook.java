package day3assignments;

class Author{
	
	private String name;
	private String email;
	private char gender;
	
	Author(String n, String e, char g){
		
		name = n;
		email = e;
		gender = g;
	}
	
	void output() {
		
		System.out.println("name is "+name+", email is "+email+", gender is "+gender);
	}
}

class Book{
	
	private String name;
	private String author;
	private double price;
	private int qty;
	
	Book(String n,String a,double p, int q){
		
		name = n;
		author = a;
		price = p;
		qty = q;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	
}

public class AuthorAndBook {
	
	public static void main(String args[]) {
		
		Book b = new Book("friends","Sid",250,500);
		Author a = new Author("Sid","sid@yahoo.com",'M');
		
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		System.out.println(b.getQty());
		
		a.output();
		
	}

}
