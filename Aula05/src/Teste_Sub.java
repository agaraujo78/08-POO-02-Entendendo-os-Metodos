
public class Teste_Sub {

	public static void main(String[] args) {
		// instanciar uma classe ou objeto
		CalculadoraSub calc = new CalculadoraSub();

		int resultado = calc.obterSubracao(15, 5);
		
		System.out.println(resultado);		
		
		
		//M�todo - apenas executa instru��es (procedimento)
     	calc.imprimirSub(15, 5);

	}

}
