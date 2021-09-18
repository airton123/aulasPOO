package emprestimos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		Cliente cliente = new Cliente();
		CalculoParcelas calc = new CalculoParcelas();
		
		
		System.out.println("digite o Nome do cliente:");
		String nome = leitor.next();
		cliente.setNome(nome);
		System.out.println("digite o CPF do " + cliente.getNome() );
		String cpf = leitor.next();
		cliente.setCpf(cpf);
		System.out.println("digite o valor a ser emprestado para  " + cliente.getNome() );
		double valor = leitor.nextDouble();
		calc.setValor(valor);
		System.out.println("Digite a quantidade de parcelas:" );
		int quantidadeDeParcelas = leitor.nextInt();
		calc.setParcelas(quantidadeDeParcelas);
		calc.calcular();
		
		System.out.println(calc.getValorfinal());
		for(int i =1; i<= calc.getParcelas();i++) {
			System.out.println("\n total = "+numberFormat.format(calc.cadaParcela[i]));
			System.out.println(" parcela = "+numberFormat.format(calc.cadaParcela[i]/(i)));
		}
	}

}
