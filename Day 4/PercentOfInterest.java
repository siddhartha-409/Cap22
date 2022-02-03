package day4assignments;


public class PercentOfInterest {
	
	public static void main(String[] args) {
		
			
		String g = args[0];
		
		//String age = args[1];
		
		int a = Integer.parseInt(args[1]);
		
		
		
		if(g.equals("Female") && a>=1 && a<=58) {
			
			System.out.println("Interest = 8.2%");
		}
		
		else if(g.equals("Female") && a>=59 && a<=120) {
			
			System.out.println("Interest = 7.6%");
		}
		
		else if(g.equals("Male") && a>=1 && a<=60) {
	
			System.out.println("Interest = 8.3%");
		}
		
		else if(g.equals("Male") && a>=61 && a<=120) {
			
			System.out.println("Interest = 8.3%");
		}
	}

}
