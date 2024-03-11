package proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Prueba {
    private static final Logger LOGGER = Logger.getLogger(Prueba.class.getName());
    
    public static void main(String[] args) {
        Fraccion fraccionUno = Fraccion.crear(2, 3);
        Fraccion fraccionDos = Fraccion.crear(5, 4);
        Mixto fraccionMixtaUno = Mixto.crear(4, 30, 2);
        Mixto fraccionMixtaDos = Mixto.crear(2, 4, 2);
        
        
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info("Resultado de sumar fracciones: " + Calculadora.sumar(fraccionUno, fraccionDos));
        }
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info("Resultado de sumar fracciones: " + Calculadora.sumar(fraccionMixtaUno, fraccionMixtaDos));
        }
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info("Resultado de restar fracciones: " + Calculadora.restar(fraccionUno, fraccionDos));
        }
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info("Resultado de restar fracciones: " + Calculadora.restar(fraccionMixtaUno, fraccionMixtaDos));
        }
        

    }

}
