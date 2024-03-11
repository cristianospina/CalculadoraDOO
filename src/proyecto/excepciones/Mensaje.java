package proyecto.excepciones;


public class Mensaje {
	
	private CodigoMensaje codigo;
	private CategoriaMensaje categoria;
	private String contenido;
	private Mensaje(final CodigoMensaje codigo, final CategoriaMensaje categoria, final String contenido) {
		setCodigo(codigo);
		setCategoria(categoria);
		setContenido(contenido);
	}
	
	public static final Mensaje crear(final CodigoMensaje codigo, final CategoriaMensaje categoria, final String contenido) {	
			return new Mensaje (codigo, categoria, contenido);
		}
	private final void setCodigo(final CodigoMensaje codigo) {
		this.codigo = codigo;
	}
	private final void setCategoria(final CategoriaMensaje categoria) {
		this.categoria =categoria;
	}
	private final void setContenido(final String contenido) {
		this.contenido =contenido;
	}
	public final CodigoMensaje getCodigo() {
		return codigo;
	}
	public final CategoriaMensaje getCategoria() {
		return categoria;
	}
	public final String getContenido() {
		return contenido;
	} 
	

}
