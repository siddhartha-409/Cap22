package day2.assignments;

class Box{
	
	double ll;
	double bb;
	double hh;
	
	void dim(double l, double b, double h) {
		
		this.ll = l;
		this.bb = b;
		this.hh = h;		
				
		
	}
	
	double vol() {
		
		return ll*bb*hh;
	}
}

public class volumeofbox {
	
	public static void main(String args[]) {
		
		Box b = new Box();
		b.dim(4, 5, 8);
		double volume = b.vol();
		System.out.println("Volume is: "+volume);
	}

}
