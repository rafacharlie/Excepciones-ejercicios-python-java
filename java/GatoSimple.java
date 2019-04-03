/**Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
Este método debe comprobar que los gatos son de distinto sexo, tras lo
cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
= garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
programa desde el que se pruebe el método.

@author Rafael Infante
*/
package excepciones;

/**
 * GatoSimple.java Definición de la clase GatoSimple
 * 
 * @author Rafael Infante
 */
public class GatoSimple {
	// atributos /////////////////////////////
	String color, raza, sexo;
	int edad;
	double peso;

	// métodos ///////////////////////////////
	// constructor
	GatoSimple(String s) {
		this.sexo = s;
	}

	// getter
	String getSexo() {
		return this.sexo;
	}

	/**
	 * Hace que el gato maulle
	 */
	void maulla() {
		System.out.println("Miauuuu");
	}

	/**
	 * Hace que el gato ronronee
	 */
	void ronronea() {
		System.out.println("mrrrrrr");
	}

	/**
	 * Hace que el gato coma. A los gatos les gusta el pescado, si le damos otra
	 * comida la rechazará.
	 *
	 * Programación orientada a objetos 123
	 * 
	 * @param comida la comida que se le ofrece al gato
	 */
	void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Hmmmm, gracias");
		} else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}

	/**
	 * Pone a pelear dos gatos. Solo se van a pelear dos machos entre sí.
	 *
	 * @param contrincante es el gato contra el que pelear
	 */
	void peleaCon(GatoSimple contrincante) {
		if (this.sexo.equals("hembra")) {
			System.out.println("no me gusta pelear");
		} else {
			if (contrincante.getSexo().equals("hembra")) {
				System.out.println("no peleo contra gatitas");
			} else {
				System.out.println("ven aquí que te vas a enterar");
			}
		}
	}

	public GatoSimple apareaCon(GatoSimple pareja) throws ExceptionApareamientoImposible {
		String s = "";
		if (!this.sexo.equals(pareja.sexo)) {
			s = (int) (Math.random() * 2) == 0 ? "hembra" : "macho";
		}else {
			//Lanzamos excepción
			throw new ExceptionApareamientoImposible("No se puede aparear son del mismo sexo.");
		}
		return new GatoSimple(s);

	}

	@Override
	public String toString() {
		return "Gato [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
				+ "]";
	}
	
	
}// fin clase GatoSimple
