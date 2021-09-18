package emprestimos;

import java.text.DecimalFormat;

public class CalculoParcelas {

	public final static double juros = 0.015;
	private int parcelas;
	private double valor;
	double[] cadaParcela = new double[300];
	private double valorfinal;
	double valorC;
	DecimalFormat numberFormat = new DecimalFormat("#.00");
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

	public double getValorfinal() {
		return valorfinal;
	}

	public void setValorfinal(double valorfinal) {
		this.valorfinal = valorfinal;
	}
	
	
	public void calcular() {

		valorC = valor;
		cadaParcela[0] = valorC;
		for (int i = 1; i <= parcelas; i++) {
			valorC = (valorC * juros) + valorC;
			cadaParcela[i] = valorC;
		}
		this.valorfinal = this.valor * Math.pow((1 + juros), parcelas);

	}
	
	public String toString(int i) {
		return "\n Em " + i + " Vezes " + "parcela = " + numberFormat.format(this.cadaParcela[i] / (i))+ " total = " + numberFormat.format(this.cadaParcela[i]) ;
	}

}
