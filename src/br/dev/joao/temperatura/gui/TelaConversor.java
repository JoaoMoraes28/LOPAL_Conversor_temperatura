package br.dev.joao.temperatura.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	
	//Variaveis de Classe
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	
	public void criarTelaConversor() {
		
		//Criando a tela
		JFrame tela = new JFrame();
		tela.setSize(500, 400);
		tela.setTitle("Conversor de Temperatura");
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Criando textLabel Celsius
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius:");
		labelCelsius.setBounds(30, 20, 200, 30);
		
		//Criando textField Celsius
		textCelsius = new JTextField();
		textCelsius.setBounds(30, 50, 440, 30);
		
		//Criando JButton Fahreinheit
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(30, 90, 215, 30);
		
		//Criando JButton Kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(255, 90, 215, 30);
		
		//Adicionando os elementos a tela
		Container container = tela.getContentPane();
		
		container.add(labelCelsius);
		container.add(textCelsius);
		container.add(buttonKelvin);
		container.add(buttonFahreinheit);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		tela.setVisible(true);
		
	}
}
