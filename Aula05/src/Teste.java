
public class Teste {

	public static void main(String[] args) {
		
		//double potencia = Math.pow(2.0, 2.0);	
		
		//System.out.println(potencia); 	
		
		
		Calculadora calc = new Calculadora(); // instanciar uma classe ou objeto
		
		//Método - apenas executa instruções (procedimento)
		calc.imprimirSoma(2, 2);
		
		
		int resultado = calc.obterSoma(10, 15);
		
		System.out.println( resultado);
	}

}
