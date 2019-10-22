package br.univille.poo.swing.componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class UtilizacaoJMenu {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(300,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		JPanel painel = new JPanel();
		
		JMenuBar menuBar = new JMenuBar();
		
		// Cria o menu Arquivo
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic(KeyEvent.VK_A);
		
		// Cria os itens do menu
		JMenuItem item = new JMenuItem("Sair",KeyEvent.VK_I);
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Fecha a tela
				//frame.setVisible(false);
				//frame.dispose();
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		
		
		JMenu subMenu = new JMenu("Novo");
		JMenuItem item3 = new JMenuItem("Abrir",KeyEvent.VK_A);
		JMenuItem item4 = new JMenuItem("Salvar",KeyEvent.VK_S);
		

		JMenuItem item6 = new JMenuItem("Projeto",new ImageIcon("assets/imgs/icone_folder.png"));
		JMenuItem item7 = new JMenuItem("Arquivo",new ImageIcon("assets/imgs/icone_novo.png"));

		//Submenu
		subMenu.add(item6);
		subMenu.add(item7);
		
		// Adiciona os items no menu
		menuArquivo.add(subMenu);
		menuArquivo.add(item3);
		menuArquivo.add(item4);
		// Adiciona um separador
		menuArquivo.addSeparator();
		menuArquivo.add(item);
		
		JMenu menuConfigs = new JMenu("Configuraçoes");
		JCheckBoxMenuItem checkItem = new JCheckBoxMenuItem("Autosave");
		checkItem.setSelected(true);
		checkItem.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JOptionPane.showMessageDialog(null, "Item selecionado? "+checkItem.isSelected());
			}
		});

		JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Opcao 1");
		JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Opcao 1");
		radio1.setSelected(true);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		
		
		menuConfigs.add(checkItem);
		menuConfigs.addSeparator();
		menuConfigs.add(radio1);
		menuConfigs.add(radio2);
		
		
		JMenu menu2 = new JMenu("Ajuda");
		JMenuItem item5 = new JMenuItem("Sobre",KeyEvent.VK_S);
		
		
		menu2.add(item5);
		
		// Adicina o menu na barra
		menuBar.add(menuArquivo);
		menuBar.add(menuConfigs);
		menuBar.add(menu2);
		
		//Adiciona Menu Bar
		frame.setJMenuBar(menuBar);
		
		
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();

	}
	

}
