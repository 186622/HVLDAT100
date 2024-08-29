package no.hvl.dat100;

import easygraphics.EasyGraphics;

public class sjakkbrett extends EasyGraphics{

	public static void main(String[] args) {
	
	
		

	}
	
	
	public void run() {
		final int L = 10;
		final int N = 10;
		
		final int startX = 50;
		final int startY= 50;
		
		makeWindow("Sjakk");
		
		
		int x = startX;
		int y = startY;
		
		
		for (int i= 1; i<=N; i++) {
			fillRectangle(x, y, L, L);

		}
	}

}
