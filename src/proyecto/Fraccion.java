package proyecto;

import proyecto.utils.UtilObjeto;

public class Fraccion {

	private long numerador;
	private long denominador;
	
	
	protected Fraccion(long numerador, long denominador) {
		
		 setNumerador(numerador);
		 setDenominador(denominador);
	}
	
	public static Fraccion crear (long numerador, long denominador) {
		UtilObjeto.validarFraccion(numerador, denominador);
		return new Fraccion	(numerador, denominador);
	}

	public final long getNumerador() {
		return numerador;
	}

	private final void setNumerador(long numerador) {
			this.numerador = numerador;

	}

	public final long getDenominador() {
		return denominador;
	}

	private final void setDenominador(long denominador) {

		this.denominador = denominador; 
		
	}

	@Override
	public String toString() {
		return getNumerador() + "/" + getDenominador();
	}
	
	
}
