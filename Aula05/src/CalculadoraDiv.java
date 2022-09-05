
public class CalculadoraDiv {

	// neste método ele irá retornar a soma;
		// este comportamento ira servir de procedimento,  
		// ou se gerarao processos e retorno de valor.
	
	double ObterDivisao (double a, double b) {
		double res = a / b;
		
		return res;
	}
	
	void imprimirDiv(double a, double b) {
		double res = a / b;
		
		System.out.printf("%.1f / %s  =  %.2f ", a, b, res);
		}
	
}
