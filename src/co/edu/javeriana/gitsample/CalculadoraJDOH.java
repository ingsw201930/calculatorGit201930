package co.edu.javeriana.gitsample;

public class CalculadoraJDOH implements ICalculator {

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
		if (b<=0) {
			return -1;
		}else {
			return a/b;
		}
	}

	@Override
	public String about() {
		// TODO Auto-generated method stub
		return "Calculator Implemented By: "+Authors.JDOH;
	}

}
