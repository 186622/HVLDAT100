//package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	  public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
	    makeWindow("Det franske flagget");

	 // Tegn den øverste svarte stripen
	    setColor(0, 0, 0); // Svart
	    fillRectangle(50, 50, 300, 66); // Tegner fra (50,50) med bredde 300 og høyde 66

	    // Tegn den midterste røde stripen
	    setColor(255, 0, 0); // Rød
	    fillRectangle(50, 116, 300, 66); // Tegner fra (50,116) med bredde 300 og høyde 66. Vi vet det må være Y = 116 siden høyden på Svart = 66. OG Y kordinatene på svart er 50.

	    // Tegn den nederste gule stripen
	    setColor(255, 204, 0); // Gul (litt tilpasset for bedre synlighet)
	    fillRectangle(50, 182, 300, 66); // Tegner fra (50,182) med bredde 300 og høyde 66

	    // Tegn kantlinjen rundt hele flagget
	    setColor(0, 0, 0); // Svart
	    drawRectangle(50, 50, 300, 198); // Tegner en ramme rundt flagget


	  }

	}