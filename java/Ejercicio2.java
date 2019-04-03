package excepciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//instancias
		GatoSimple garfield = new GatoSimple("macho");
		GatoSimple lisa = new GatoSimple("hembra");
		GatoSimple tom = new GatoSimple("macho");
		
		/*si se aparean gatos del distinto sexo, devuelve un objeto gato y del mismo salta excepcion*/
		try {
			System.out.println(tom.apareaCon(lisa));
		} catch (ExceptionApareamientoImposible e) {
			System.out.println(e.getMessage());
		}
		
	}

}
