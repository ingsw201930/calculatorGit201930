package co.edu.javeriana.gitsample;

public class CalculadoraKPN implements ICalculator {

	@Override
	public double add(double a, double b) {
		double res = a + b;
		return res;
	}

	@Override
	public double substract(double a, double b) {
		double res = a - b;
		return res;
	}

	@Override
	public double multiply(double a, double b) {
		double res = a * b;
		return res;
	}

	@Override
	public double divide(double a, double b) {
		double res = a / b;
		return res;
	}

	@Override
	public String about() {
		// TODO Auto-generated method stub
		return null;
	}

  

}
