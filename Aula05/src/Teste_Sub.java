
public class Teste_Sub {

	public static void main(String[] args) {
		// instanciar uma classe ou objeto
		CalculadoraSub calc = new CalculadoraSub();

		int resultado = calc.obterSubracao(15, 5);
		
		System.out.println(resultado);		
		
		
		//Método - apenas executa instruções (procedimento)
     	calc.imprimirSub(15, 5);

	}

}
