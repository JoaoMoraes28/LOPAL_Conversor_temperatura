package br.dev.joao.temperatura.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.joao.temperatura.model.Temperatura;

public class TelaConversor {
	
	//Variaveis de Classe
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	
	
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
		
		//Criando JLabel labelResultado
		labelResultado = new JLabel();
		labelResultado.setText("");
		labelResultado.setBounds(185, 140, 215, 40);
		
		//Criando a funcao ao botao Fahreinheit
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Temperatura temperatura = new Temperatura();
				
				double temperaturaDouble = 0;
				
				try {
					
					temperaturaDouble = Double.parseDouble(textCelsius.getText());
					
					temperatura.setCelsius(temperaturaDouble);
					
					temperatura.converterParaFahreinheit();
					
					String resultado = Double.toString(temperatura.getCelsius());
					
					resultado = resultado.replace(".", ",");
					
					labelResultado.setText(resultado + " FAHREINHEIT");
					
				} catch (Exception e1) {
					
					labelResultado.setText("Valor fornecido esta incorreto! Tente novamente");
				}
				
				
			}
		});
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Temperatura temperatura = new Temperatura();
				double temperaturaDouble = 0;
				
				try {
					
					temperaturaDouble = Double.parseDouble(textCelsius.getText());

					temperatura.setCelsius(temperaturaDouble);
					
					temperatura.converterParaKelvin();
					
					String resultado = Double.toString(temperatura.getCelsius());
					
					resultado = resultado.replace(".", ",");
					
					labelResultado.setText(resultado + " KELVIN");
					
				} catch (Exception e2) {
					
					labelResultado.setText("Valor fornecido esta incorreto! Tente novamente");
				}
				
			
			}
		});
		
		//Adicionando os elementos a tela
		Container container = tela.getContentPane();
		
		container.add(labelCelsius);
		container.add(textCelsius);
		container.add(buttonKelvin);
		container.add(buttonFahreinheit);
		container.add(labelResultado);
		
		
		
		
		tela.setVisible(true);
		
	}
}
