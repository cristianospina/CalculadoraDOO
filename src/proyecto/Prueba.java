package proyecto;


import javax.swing.JOptionPane;


public class Prueba {
    	
    public static void main(String[] args) {
    	final String PALABRARESPUESTA = "El resultado de las fracciones es: ";
    	boolean continuar = true;
    	
    	while (continuar) {
    	String[] tiposFraccion = {"Fracción Normal", "Número Mixto"};
        int tipoFraccionSeleccionado = JOptionPane.showOptionDialog(null, "Seleccione el tipo de fracción:", "Tipo de Fracción", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tiposFraccion, tiposFraccion[0]);
        
        

        if (tipoFraccionSeleccionado == 0) {
        	String numeradorStr = JOptionPane.showInputDialog("Ingrese el numerador para la fraccion uno:");
            int numeradorUno = Integer.parseInt(numeradorStr);
            String denominadorStr = JOptionPane.showInputDialog("Ingrese el denominador para la fraccion uno:");
            int denominadorUno = Integer.parseInt(denominadorStr);
            
            Fraccion fraccionUno;
            fraccionUno = Fraccion.crear(numeradorUno, denominadorUno);
            
            String numerador = JOptionPane.showInputDialog("Ingrese el numerador para la fraccion dos:");
            int numeradorDos = Integer.parseInt(numerador);
            String denominador = JOptionPane.showInputDialog("Ingrese el denominador para la fraccion uno:");
            int denominadorDos = Integer.parseInt(denominador);
            
            Fraccion fraccionDos;
            fraccionDos = Fraccion.crear(numeradorDos, denominadorDos);
            
            String[] operaciones = {"Suma", "Resta", "Multiplicación", "División"};
            int operacionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione la operación a realizar:", "Operación", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, operaciones, operaciones[0]);
            
            switch (operacionSeleccionada) {
            case 0:
            	JOptionPane.showMessageDialog(null, PALABRARESPUESTA + Calculadora.sumar(fraccionUno, fraccionDos));
                break;
            case 1:
            	JOptionPane.showMessageDialog(null, PALABRARESPUESTA + Calculadora.restar(fraccionUno, fraccionDos));
                break;
            case 2:
            	JOptionPane.showMessageDialog(null, PALABRARESPUESTA + Calculadora.multiplicar(fraccionUno, fraccionDos));
                break;
            case 3:
            	JOptionPane.showMessageDialog(null, PALABRARESPUESTA + Calculadora.dividir(fraccionUno, fraccionDos));
                break;
            default:
                break;
        }
            
        } else {
	            String parteEnteraStr = JOptionPane.showInputDialog("Ingrese la parte entera para la fraccion Uno:");
	            int parteEntera = Integer.parseInt(parteEnteraStr);
	            String numeradorStr = JOptionPane.showInputDialog("Ingrese el numerador para la fraccion Uno:");
	            int numerador = Integer.parseInt(numeradorStr);
	            String denominadorStr = JOptionPane.showInputDialog("Ingrese el denominador para la fraccion Uno:");
	            int denominador = Integer.parseInt(denominadorStr);
	            
	            Fraccion  fraccionMixtaUno;
	            fraccionMixtaUno = Mixto.crear(parteEntera, numerador, denominador);
	            
	            String parteEnteraD = JOptionPane.showInputDialog("Ingrese la parte entera para la fraccion Uno:");
	            int parteEnteraDos = Integer.parseInt(parteEnteraD);
	            String numeradorD = JOptionPane.showInputDialog("Ingrese el numerador para la fraccion Uno:");
	            int numeradorDos = Integer.parseInt(numeradorD);
	            String denominadorD = JOptionPane.showInputDialog("Ingrese el denominador para la fraccion Uno:");
	            int denominadorDos = Integer.parseInt(denominadorD);
	            
	            Fraccion  fraccionMixtaDos;
	            fraccionMixtaDos = Mixto.crear(parteEnteraDos, numeradorDos, denominadorDos);
	            
	            String[] operaciones = {"Suma", "Resta", "Multiplicación", "División"};
	            int operacionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione la operación a realizar:", "Operación", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, operaciones, operaciones[0]);
	            
		            switch (operacionSeleccionada) {
		            case 0:
		            	JOptionPane.showMessageDialog(null, PALABRARESPUESTA + Calculadora.sumar(fraccionMixtaUno, fraccionMixtaDos));
		                break;
		            case 1:
		            	JOptionPane.showMessageDialog(null, PALABRARESPUESTA + Calculadora.restar(fraccionMixtaUno, fraccionMixtaDos));
		                break;
		            case 2:
		            	JOptionPane.showMessageDialog(null, PALABRARESPUESTA + Calculadora.multiplicar(fraccionMixtaUno, fraccionMixtaDos));
		                break;
		            case 3:
		            	JOptionPane.showMessageDialog(null, PALABRARESPUESTA + Calculadora.dividir(fraccionMixtaUno, fraccionMixtaDos));
		                break;
		            default:
		                break;
		        }
	        }
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", "Continuar", JOptionPane.YES_NO_OPTION);
	        if (opcion != JOptionPane.YES_OPTION) {
	            continuar = false;
	        }

    	}
    }
}
