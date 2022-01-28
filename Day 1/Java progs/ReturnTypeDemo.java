package comdemo;

class Multiply{
	
	int Mul() {
		int n1 = 10;
		int n2 = 20;
		
		int res = n1*n2;
		
		return res;						
				
		
	}
}

public class ReturnTypeDemo {
	
	public static void main(String args[]) {
		
		Multiply m = new Multiply();
		
		int r = m.Mul();
		
		System.out.println("Output is "+r);
				
		
		
	}

}
