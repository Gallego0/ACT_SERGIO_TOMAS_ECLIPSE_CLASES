
public class PrincipalApp_ACTIVIDADES {	
	public static void main (String [] args) {
		
		Numero_consonantes nc = new Numero_consonantes("HolaTomasySergio");
		
		System.out.println(nc.numero_Consonantes());
		
		Sin_Vocales sv = new Sin_Vocales("HolaTomasySergio");
		
		System.out.println(sv.eliminarVocales());
	}
}
