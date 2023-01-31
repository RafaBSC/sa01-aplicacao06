package br.com.javatagua.sa1.app6;

import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor1, valor2;
		JOptionPane.showMessageDialog(null, "Panorama de Aviação Brasileira - ABEAR");
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Preço do avião: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário: "));
		
		
		FrotaBO cbo = new FrotaBO();
		 
		JOptionPane.showMessageDialog(null, "Valor total dos aviões: " + cbo.calcularFrota(valor1, valor2));
	}

}
