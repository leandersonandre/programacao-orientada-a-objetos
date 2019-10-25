package br.univille.poo.swing.componentes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class UtilizacaoJTabbedPane {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		JTabbedPane tabPane = new JTabbedPane();
		ImageIcon icon = new ImageIcon("assets/imgs/icone_folder.png");
		
		Color colors[] = {Color.WHITE,Color.BLUE
				,Color.DARK_GRAY,Color.YELLOW,Color.MAGENTA};
		
		for(int i = 0; i < 5; i ++) {
			tabPane.addTab("Tab "+i, icon, criarPanel(colors[i],"Tab "+i),
                "Hint do Tab "+i);
		}
		
		
		// Adiciona o painel na janela
		frame.add(tabPane);
		frame.pack();
		
		frame.show();

	}
	
	// Cria um painel com a cor de fundo e um label
    private static JPanel criarPanel(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	panel.setPreferredSize(new Dimension(600, 600));
    	// Configura um tamanho padrao do painel
    	return panel;
    }
	

}
