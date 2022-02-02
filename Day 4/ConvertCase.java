package day4assignments;

public class ConvertCase {

	public static void main(String[] args) {
		
		char c = 'Z';
		
				
		if (Character.isUpperCase(c))
			System.out.println(c+"->"+Character.toLowerCase(c));
		else
			System.out.println(c+"->"+Character.toUpperCase(c));

	}

}
