
/**
 * Class for make basic calculation
 * @author Carlos Gabriel
 * 
 */
public class Calculadora1 {

	private int numero1;
	private int numero2;
	
	// Constructors
	
	/**
	 * Constructor formed by two atributtes
	 * 
	 */
	public Calculadora1(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// Methods
	
	/**
	 * Method that sums two numbers and return the value
	 * @return numero1 + numero2
	 * @author Carlos Gabriel
	 */
	public int suma(){
		return (numero1 + numero2);
		 
	}
	
	/**
	 * Method that substract two numbers and return the value
	 * @return numero1 - numero2
	 * @author Carlos Gabriel
	 */
	public int resta(){
		return (numero1 - numero2);
	}
	
	/**
	 * Method that multiplicate two numbers and return the value
	 * @return numero1 * numero2
	 * @author Carlos Gabriel
	 */
	
	public int multiplica(){
		return (numero1 * numero2);
	
	}
	/**
	 * Method that divide two numbers and return the value
	 * @return numero1 / numero2
	 * @author Carlos Gabriel
	 */
	
	public Integer divide(){
		return numero1/numero2;
		
	}

}
