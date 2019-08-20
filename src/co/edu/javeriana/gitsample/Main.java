package co.edu.javeriana.gitsample;

public class Main {

	public static void main(String[] args) {
		// Create calculator implementation
		System.out.println("Git Calculator!");
		 ICalculator calculator = new CalculadoraACMU();
		 System.out.println(calculator.divide(100,0));
		// calculator.multiply(2,5);
		// calculator.add(7,5);
		// calculator.substract(8,9);
		
	}

}
