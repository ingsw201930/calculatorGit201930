package co.edu.javeriana.gitsample;

//class created by Adri�n Esteban Garc�a Ardila

public class CalculadoraAEGA implements ICalculator{

	@Override
	public double add(double a, double b) {
		return a+b;
	}

	@Override
	public double substract(double a, double b) {
		return a-b;
	}

	@Override
	public double multiply(double a, double b) {
		return a*b;
	}

	@Override
	public double divide(double a, double b) {
		return a/b;
	}

	@Override
	public String about() {
		return "Calculator implemented by "+Authors.AEGA;
	}

}
