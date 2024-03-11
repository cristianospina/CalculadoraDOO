package proyecto.excepciones;
import java.io.Serializable;



public class FraccionNullException extends RuntimeException implements Serializable{
		private static final long serialVersionUID = 1L;

		public FraccionNullException ( final String MensajeUsuario) {
			super(MensajeUsuario);
		}

		public static final String crear (final String mensajeUsuario) {
			return mensajeUsuario;
		}
	
}
