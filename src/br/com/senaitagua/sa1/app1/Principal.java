package br.com.senaitagua.sa1.app1;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2;
		
		JOptionPane.showMessageDialog(null, "Empresa Voe - Grupo Empresarial");
		
		//Entrada de Dados:
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro avi�o: ")); 
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo avi�o: "));
		
		//Passar uma mensagem (m�todo) para o Objeto:
		CalculoBO cbo = new CalculoBO();
		
		// Utilizar o Objeto
		JOptionPane.showMessageDialog(null, cbo.Somar(valor1, valor2));
		
		

	}

}
