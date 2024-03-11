package proyecto;

import java.util.Objects;

import proyecto.excepciones.CatalogoMensajes;
import proyecto.excepciones.CodigoMensaje;
import proyecto.excepciones.FraccionNullException;

public class Mixto extends Fraccion {
	
	private long parteEntera;


	private Mixto(long parteEntera, long numerador, long denominador) {
		super(numerador, denominador);
		setParteEntera(parteEntera);
	}

	public final long getParteEntera() {
		return parteEntera;
	}

	private final void setParteEntera(long parteEntera) {
		this.parteEntera = parteEntera;
	}
	

	public static Mixto crear(long parteEntera, long numerador, long denominador) {
		if (Objects.isNull(parteEntera) || denominador == 0) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M003);
			throw new FraccionNullException(mensajeUsuario);
        }
        if (Objects.isNull(numerador)) {
        	final var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M002);
			throw new FraccionNullException(mensajeUsuario);
        }
        if (Objects.isNull(denominador) || denominador == 0) {
        	final var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M002);
			throw new FraccionNullException(mensajeUsuario);
        }
		if ( denominador < 0 ) {
			numerador = numerador * -1;
			denominador = denominador * -1;
		}
		return  new Mixto(parteEntera, numerador, denominador);
	}
	
	@Override
	public String toString() {
		return getParteEntera() + "->" + super.toString();
	}
	
	
	
}
