
public class Numero_consonantes {
	
	private String frase;

	public Numero_consonantes(String frase) {
		super();
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public int numero_Consonantes () {
		
		int cantidad=0;
		for (int i=0;i<frase.length(); i++) {
			if (frase.charAt(i)!='a' && frase.charAt(i)!='e' && frase.charAt(i)!='i' && frase.charAt(i)!='o' && frase.charAt(i)!='u') {
				cantidad++;
			}
		}
		
		return cantidad;
	}

	@Override
	public String toString() {
		return "Numero_consonantes [frase=" + frase + "]";
	}
	
	
}
