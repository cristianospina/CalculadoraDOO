package proyecto.utils;

import java.util.Objects;


import proyecto.excepciones.CatalogoMensajes;
import proyecto.excepciones.CodigoMensaje;
import proyecto.excepciones.FraccionNullException;

public class UtilObjeto{
		
	private UtilObjeto() {
		super();
	}
	public static  void validarFraccion (long numerador, long denominador) {
		if (Objects.isNull(numerador)) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M003);
			throw new FraccionNullException(mensajeUsuario);
	    }
	    if (Objects.isNull(denominador) || denominador == 0) {
	    	final var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M002);
			throw new FraccionNullException(mensajeUsuario);
	    }
		
	}
	
}
