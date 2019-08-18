package co.edu.javeriana.gitsample;

public class CalculadoraDHS implements ICalculator {

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
		return ( b == 0 ) ? Double.POSITIVE_INFINITY : a/b ;
	}

	@Override
	public String about() {
		// TODO Auto-generated method stub
		return "implemented by : "+ Authors.DHS;
	}

}
