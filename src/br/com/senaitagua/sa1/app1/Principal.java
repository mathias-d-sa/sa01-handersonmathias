package br.com.senaitagua.sa1.app1;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2;
		
		JOptionPane.showMessageDialog(null, "Empresa Voe - Grupo Empresarial");
		
		//Entrada de Dados:
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro avião: ")); 
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo avião: "));
		
		//Passar uma mensagem (método) para o Objeto:
		CalculoBO cbo = new CalculoBO();
		
		// Utilizar o Objeto
		JOptionPane.showMessageDialog(null, cbo.Somar(valor1, valor2));
		
		String resp1 = JOptionPane.showInputDialog("Digite o faturamento de Janeiro: ");
		String resp2 = JOptionPane.showInputDialog("Digite o faturamento de Fevereiro: ");
		double valorJan = Double.parseDouble(resp1);
		double valorFev = Double.parseDouble(resp2);
		
		JOptionPane.showMessageDialog(null, "Média Bimestral Fat. : " + cbo.calcularMedia(valorJan, valorFev));
		
		
	}

}
