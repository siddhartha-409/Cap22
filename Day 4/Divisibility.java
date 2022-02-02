package day4assignments;

public class Divisibility {

	public static void main(String[] args) {
		
		int n = 1;
		int j = 0;
		
		
		while (n<6) 
		{
			
			
			for (int i=j+1;;i++)
			{				
				if (i%2==0 && i%3==0 && i%5==0) 
				{					
					
					System.out.println(i);				
					n+=1;
					j=i;
					break;
					
				}											
				
				
			}
			
			
		}

	}

}
