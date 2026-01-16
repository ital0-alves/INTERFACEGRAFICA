package intergrafica;

import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame tela = new JFrame("tela de Denis");
		JLabel texto = new JLabel("Sextou com S da sabotagem!");
		JLabel img = new JLabel();
		JTextField valor = new JTextField(15);
		JButton botao = new JButton("Enviar");
		botao.setBounds(30, 280, 150, 30);
		tela.getContentPane().add(botao);

		valor.setBounds(30, 230, 150, 30);
		tela.getContentPane().add(valor);
		ImageIcon icon = new ImageIcon("src/imagem/tigrinho_binary_342348.jpg");
		Image foto = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		img.setIcon(new ImageIcon(foto));
		img.setBounds(30, 60, 150, 150);
		tela.getContentPane().add(img);

		tela.getContentPane().add(texto);
		texto.setBounds(30, 20, 210, 20);
		tela.getContentPane().setBackground(Color.decode("#edd1CB"));
		//Ação do botão
		botao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String textoDigitado = valor.getText();
				JOptionPane.showMessageDialog(null,"seu valor é de "+textoDigitado+" . Espere sentado.", "Informação", 1);
				
			}
		});
		tela.setLayout(null);
		tela.setSize(600, 600);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JOptionPane.showMessageDialog(null, "professor
		// legal","Denis",JOptionPane.ERROR_MESSAGE);
		// String horario = JOptionPane.showInputDialog(null,"Que horas
		// são","Horario",1);
		// JOptionPane.showMessageDialog(null,"são "+horario,"Horas",1);
		// JOptionPane.showConfirmDialog(null,"Deseja Salvar?");
		// Object[] opcoes = {"salvar", "não salvar", "cancelar"};
		// JOptionPane.showOptionDialog(null, "O que deseja
		// fazer?","Opções",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,
		// opcoes[0]);

	}

}
