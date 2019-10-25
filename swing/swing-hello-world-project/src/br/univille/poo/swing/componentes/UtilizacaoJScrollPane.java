package br.univille.poo.swing.componentes;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UtilizacaoJScrollPane {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Dimension tamanhoPreferido = new Dimension(300,300);
	
		
		JPanel painel = new JPanel();
		
		
		
		JTextArea textArea = new JTextArea(14,14);
		textArea.setPreferredSize(tamanhoPreferido);
		
		JScrollPane scroll = new JScrollPane(textArea);
		painel.add(scroll);
		
		// Adiciona o painel na janela
		frame.add(painel);
		frame.pack();
		
		frame.show();

	}
	

}
