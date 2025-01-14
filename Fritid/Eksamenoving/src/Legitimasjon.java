
public abstract class Legitimasjon {
	private String navn;
	private boolean validert;
	
	
	public Legitimasjon(String navn) {
		this.navn = navn;
		 this.validert = false;
	}
	
	
	public String getNavn() {
		return this.navn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public boolean getValidert() {
		return this.validert;
	}
	
	public void setValidert(boolean validert) {
		this.validert = validert;
	}
	
	
	public abstract void valider();
	
	
	
}

