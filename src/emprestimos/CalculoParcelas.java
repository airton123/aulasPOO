package emprestimos;



public class CalculoParcelas {

	public final static double juros = 0.015;
	private int parcelas;
	private double valor;
	 double[] cadaParcela = new double[100] ;
	private double valorfinal;
	double valorC;
	
	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void calcular() {
		double x;
		double y;
		valorC = valor;
		cadaParcela[0] = valorC;
		for(int i = 1; i<=parcelas; i++) {
			valorC = (valorC*juros)+valorC;
			cadaParcela[i] = valorC;
		}
			this.valorfinal = this.valor* Math.pow((1+juros),parcelas);
			
			
	
		
		
		
	}

	public double getValorfinal() {
		return valorfinal;
	}

	public void setValorfinal(double valorfinal) {
		this.valorfinal = valorfinal;
	}
	
		

}


