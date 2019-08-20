/**
 * 
 */
package co.edu.javeriana.gitsample;

/**
 * @author USUARIO
 *
 */
public class CalculatorLFVQ implements ICalculator {

	/* (non-Javadoc)
	 * @see co.edu.javeriana.gitsample.ICalculator#add(double, double)
	 */
	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	/* (non-Javadoc)
	 * @see co.edu.javeriana.gitsample.ICalculator#substract(double, double)
	 */
	@Override
	public double substract(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	/* (non-Javadoc)
	 * @see co.edu.javeriana.gitsample.ICalculator#multiply(double, double)
	 */
	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	/* (non-Javadoc)
	 * @see co.edu.javeriana.gitsample.ICalculator#divide(double, double)
	 */
	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		if(b==0)
		{
			return Double.POSITIVE_INFINITY;
		}
		return a/b;
	}

	/* (non-Javadoc)
	 * @see co.edu.javeriana.gitsample.ICalculator#about()
	 */
	@Override
	public String about() {
		// TODO Auto-generated method stub
		return "This is the calculator made by Leyder Vera";
	}

}
