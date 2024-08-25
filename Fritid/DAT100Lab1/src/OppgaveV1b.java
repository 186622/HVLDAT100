

import static java.lang.Integer.parseInt;
import easygraphics.*;

public class OppgaveV1b extends EasyGraphics {

	public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
		  
	    makeWindow("CO-2 nivå indikator");

	    int co2 = parseInt( getText("PPM: ") );
	  
	    if (co2 < 500) {
	    	setColor(0, 255, 0); // green
	    } else {
	    	setColor(255,0,0); // red
	    }
	    
	    fillCircle(100, 160, 60);
	    
	    
	    switch (co2) {
	    case co2<500:
	    	setColor(0, 255, 0); // green
	    break;
	    case 500<co2<700:
	    	setColor(255,255,0); // yellow
	    break;
	    case co2>500:
	    	setColor(255, 0, 0);
	    break:
	 	    }
	    fillCircle(100, 160, 60);

	  }
}
