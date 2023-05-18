
public class Sin_Vocales {
	private String frase;

	public Sin_Vocales(String frase) {
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String eliminarVocales() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (!esVocal(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
	@Override
	public String toString() {
		return "Sin_Vocales [frase=" + frase + "]";
	}
}
