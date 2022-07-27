package dio.basecamp.metodos;

public class Calculadora {
	
	
	public static void soma(double a, double b) {
		
		double resultado = a + b;
		System.out.println("a soma de " + a + " + " + b + " é: " + resultado);
		
	}
	
	public static void subtracao(double a, double b) {
		
		double resultado = a - b;
		System.out.println("a subtração de " + a + " - " + b + " é: " + resultado);
		
	}
	
	public static void multiplicacao(double a, double b) {
		
		double resultado = a * b;
		System.out.println("a multiplicação de " + a + " x " + b + " é: " + resultado);
		
	}
	
	public static void divisao(double a, double b) {
		
		double resultado = a / b;
		System.out.println("a divisão de " + a + " / " + b + " é: " + resultado);
		
	}

}
