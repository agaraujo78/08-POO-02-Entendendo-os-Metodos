
public class Calculadora {
		
		void imprimirSoma(int a, int b) {
			int res = a + b;
			
			System.out.printf("%d + %d = %d", a, b, res);
			
		}
		
		//neste método ele irá retornar a soma;
		// este comportamento ira servir de procedimento, ou se gerarao processos 
		// e retorno de valor.
		int obterSoma(int a, int b){
			int res = a + b;
			
			return res;
		}
}
