package com.demo.loopdemo;

class Loop{
	
	public static void show() {
		
		for(int i=0;i<9;i++) {
			
			System.out.println("Number "+i);
		}
		
		int i = 0;
		while(i<9) {
			
			i++;
			System.out.println("Numbers "+i);
			
		}
		
		int k=0;
		do {			
						
			k++;
			System.out.println("Numbers "+k);			
		}while(k<9);
	}
}

public class LoopDemo {

	public static void main(String[] args) {
		
		Loop l = null;
		
		l.show();

	}

}
