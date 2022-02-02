package com.demo.exceptionhandling;

public class TryWithMultipleCatchBlocks {
	
	public static void main(String args[]) {
		
		int array[] = new int[10];
		
		try {
			
			array[11] = 100;
		
			System.out.println(array);
			
		}
		
		catch (ArrayIndexOutOfBoundsException r) {
			
			System.out.println("caused due to array"+r);
		}
		
		catch (IndexOutOfBoundsException e) {
			
			System.out.println("IndexOutOfBoundsException "+e);
		}
		
		catch (Exception e) {
			
			System.out.println("Exception "+e);
		}
	}

}
