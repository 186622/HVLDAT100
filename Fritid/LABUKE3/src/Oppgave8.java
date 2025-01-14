import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Oppgave8 {

}



public class NettStudent extends  Student {
	private String hjemSted;
	
	public NettStudent(int studentNr, String navn, String etternavn, String studieSted, String hjemSted) {
		super(studentNr, navn, etternavn, studieSted);
		this.hjemSted = hjemSted;
	}

	public String getHjemSted() {
		return this.hjemSted;
	}

	public void setHjemSted(String hjemSted) {
		this.hjemSted = hjemSted;
	}
	@Override
	public String toString() {
	    return super.toString() + ", Hjemsted: " + hjemSted;

	}


	List<NettStudent> nettStudenter = new ArrayList<>();

	    nettStudenter.add(new NettStudent(101, "Ola", "Nordmann", "Oslo", "Bergen"));
	    nettStudenter.add(new NettStudent(102, "Kari", "Hansen", "Bergen", "Stavanger"));
	    nettStudenter.add(new NettStudent(103, "Per", "Johansen", "Trondheim", "Bergen"));
	    nettStudenter.add(new NettStudent(104, "Lise", "Nilsen", "Tromsø", "Oslo"));
	    nettStudenter.add(new NettStudent(105, "Jonas", "Andersen", "Oslo", "Trondheim"));

	    
	    Set<String> unikeHjemsteder = new HashSet<>();
	    for (NettStudent student : nettStudenter) {
	    	unikeHjemsteder.add(student.getHjemsted());
	    }
	    
	    System.out.println("Unike Hjemsteder");
	    for (String hjemSted : unikeHjemsteder) {
	    	System.out.println(hjemsted);
	    }
	    
}




