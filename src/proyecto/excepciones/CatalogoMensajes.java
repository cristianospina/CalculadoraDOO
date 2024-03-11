package proyecto.excepciones;

import java.util.HashMap;
import java.util.Map;

public	final class CatalogoMensajes {
	
	private static final Map<CodigoMensaje, Mensaje> MENSAJES = new HashMap<>();
	
	static {
		cargarMensajes();
	}
	
	private CatalogoMensajes() {
		super();
	}
	private static final void cargarMensajes() {
		agregarMensaje(Mensaje.crear(CodigoMensaje.M001, CategoriaMensaje.FATAL, "la fraccion no puede estar vacia"));		
		agregarMensaje(Mensaje.crear(CodigoMensaje.M002, CategoriaMensaje.FATAL, "El denominador no puede ser 0 o nulo"));	
		agregarMensaje(Mensaje.crear(CodigoMensaje.M003, CategoriaMensaje.FATAL, "El numerador no puede ser null"));	
	}
	
	private static final void agregarMensaje ( final Mensaje mensaje) {
		MENSAJES.put(mensaje.getCodigo(), mensaje);
	}
	
	public static final Mensaje obtenerMensaje (final CodigoMensaje codigo) {
		
		return MENSAJES.get(codigo);
	}
	
	public static final String obtenerContenido(final CodigoMensaje codigo) {
		return obtenerMensaje(codigo).getContenido();
	}

}
