
public class Teste_Div {

	public static void main(String[] args) {
		
		CalculadoraDiv calc = new CalculadoraDiv();
		
		
		double resultado = calc.ObterDivisao(5, 7);
		
		System.out.println(resultado);
		
		//Método - apenas executa instruções (procedimento)
		calc.imprimirDiv(5.0, 7.0);
	}

}
