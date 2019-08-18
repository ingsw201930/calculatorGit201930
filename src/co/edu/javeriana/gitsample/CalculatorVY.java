package co.edu.javeriana.gitsample;

public class CalculatorVY implements ICalculator{

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double substract(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		if (b == 0) System.out.println("División por cero, No sé qué espera de mí. :(");
		return b==0? null : a/b;
	}

	@Override
	public String about() {
		// TODO Auto-generated method stub
		return "Calculator implemented by "+Authors.VY;
	}

}
