package emprestimos;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		CalculoParcelas calc = new CalculoParcelas();

		cliente.setNome(JOptionPane.showInputDialog("digite o Nome do cliente:"));
		cliente.setCpf(JOptionPane.showInputDialog("digite o CPF do " + cliente.getNome()));
		calc.setValor(Double.parseDouble(JOptionPane.showInputDialog("digite o valor a ser emprestado para  " + cliente.getNome())));
		calc.setParcelas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de parcelas:")));
		calc.calcular();

		
		String mensagen = cliente.toString()+" Valor emprestado: "+calc.getValor();
		for (int i = 1; i <= calc.getParcelas(); i++) {
			mensagen = mensagen + calc.toString(i);
		}
		
		JOptionPane.showMessageDialog(null, mensagen);
		
	}
}
