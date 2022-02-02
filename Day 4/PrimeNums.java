package day4assignments;

public class PrimeNums {

	public static void main(String[] args) {
		
		for (int n=11;n<100;n++) {
			
			int flag = 0;
			
			for(int i=2;i<n/2;i++)
				
				if(n%i==0) {
					
					flag+=1;
					break;
				}
			
			if(flag==0)
				System.out.println(n);
						
			
		}

	}

}
