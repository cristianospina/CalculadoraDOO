package proyecto;



public class Calculadora {

	private Calculadora() {
		super();
	}

	public static Fraccion sumar(Fraccion fraccionUno, Fraccion fraccionDos) {

		long numerador =fraccionUno.getDenominador() * fraccionDos.getNumerador()
				+fraccionUno.getNumerador() * fraccionDos.getDenominador() ;
		long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();
		Fraccion resultSimp = simplificarFraccion(numerador, denominador);
		
		return Fraccion.crear(resultSimp.getNumerador(), resultSimp.getDenominador());
	}

	public static Fraccion restar(Fraccion fraccionUno, Fraccion fraccionDos) {

		long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador()
				- fraccionUno.getDenominador() * fraccionDos.getNumerador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();

		Fraccion resultSimp =simplificarFraccion(numerador, denominador);
		return Fraccion.crear(resultSimp.getNumerador(), resultSimp.getDenominador());
	}

	public static Fraccion multiplicar(Fraccion fraccionUno, Fraccion fraccionDos) {

		long numerador = fraccionUno.getNumerador() * fraccionDos.getNumerador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();

		Fraccion resultSimp =simplificarFraccion(numerador, denominador);

		return Fraccion.crear(resultSimp.getNumerador(), resultSimp.getDenominador());
	}

	public static Fraccion dividir(Fraccion fraccionUno, Fraccion fraccionDos) {

		long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getNumerador();
		Fraccion resultSimp = simplificarFraccion(numerador, denominador);
		return Fraccion.crear(resultSimp.getNumerador(), resultSimp.getDenominador());
	}

	public static Mixto sumar(Mixto mixtoUno, Mixto mixtoDos) {
		Fraccion fraccionUno = convertirAFraccion(mixtoUno);
		Fraccion fraccionDos = convertirAFraccion(mixtoDos);

		Fraccion resultado = sumar(fraccionUno, fraccionDos);
		Fraccion resulSimp = simplificarFraccion(resultado.getNumerador(), resultado.getDenominador());
		return convertirAMixto(resulSimp);
	}

	public static Mixto restar(Mixto mixtoUno, Mixto mixtoDos) {
		Fraccion fraccionUno = convertirAFraccion(mixtoUno);
		Fraccion fraccionDos = convertirAFraccion(mixtoDos);

		Fraccion resultado = restar(fraccionUno, fraccionDos);
		Fraccion resulSimp = simplificarFraccion(resultado.getNumerador(), resultado.getDenominador());
		return convertirAMixto(resulSimp);
	}

	public static Mixto multiplicar(Mixto mixtoUno, Mixto mixtoDos) {
		Fraccion fraccionUno = convertirAFraccion(mixtoUno);
		Fraccion fraccionDos = convertirAFraccion(mixtoDos);

		Fraccion resultado = multiplicar(fraccionUno, fraccionDos);
		Fraccion resulSimp = simplificarFraccion(resultado.getNumerador(), resultado.getDenominador());
		return convertirAMixto(resulSimp);
	}

	public static Mixto dividir(Mixto mixtoUno, Mixto mixtoDos) {
		Fraccion fraccionUno = convertirAFraccion(mixtoUno);
		Fraccion fraccionDos = convertirAFraccion(mixtoDos);

		Fraccion resultado = dividir(fraccionUno, fraccionDos);
		Fraccion resulSimp = simplificarFraccion(resultado.getNumerador(), resultado.getDenominador());
		return convertirAMixto(resulSimp);
	}

	private static Mixto convertirAMixto(Fraccion numero) {
		int parteEntera = (int) (numero.getNumerador() / numero.getDenominador());
		int nuevoNumerador = (int) (numero.getNumerador() % numero.getDenominador());
		return Mixto.crear(parteEntera, nuevoNumerador, numero.getDenominador());
	}

	private static Fraccion convertirAFraccion(Mixto numero) {
		int numerador = (int) ((numero.getParteEntera() * numero.getDenominador()) + numero.getNumerador());
		return Fraccion.crear(numerador, numero.getDenominador());
	}
	public static Fraccion simplificarFraccion(long numerador, long denominador) {
	    
	    
	    long maxComunDivisor =  calcularMaximoComunDivisor(numerador, denominador);
	    numerador /= maxComunDivisor;
	    denominador /= maxComunDivisor;

	    return Fraccion.crear(numerador, denominador);
	}

	
	public static long calcularMaximoComunDivisor(long numerador, long denominador) {
	    while (denominador != 0) {
	        long resto = numerador % denominador;
	        numerador = denominador;
	        denominador = resto;
	    }
	    return numerador;
	}



}
