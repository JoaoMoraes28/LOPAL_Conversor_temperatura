package br.dev.joao.temperatura.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import br.dev.joao.temperatura.model.Temperatura;

public class TelaConversor {
	
	//Variaveis de Classe
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	
	public void criarTelaConversor() {
		
		//Criando a tela e colocando suas caracteristicas
		JFrame tela = new JFrame();
		tela.setSize(500, 340);
		tela.setTitle("Conversor de Temperatura");
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Criando textLabel Celsius, seu texto e sua localizacao
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius:");
		labelCelsius.setBounds(30, 35, 200, 30);
		
		//Criando textField Celsius, editando a fonte do textCelsius e labelresultado
		textCelsius = new JTextField();
		Font font = new Font("Arial" , Font.PLAIN , 20);
		textCelsius.setFont(font);
		textCelsius.setBounds(30, 70, 440, 30);
		
		//Criando JButton Fahreinheit, seu texto e localizacao
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(30, 110, 215, 45);
		
		//Criando JButton Kelvin, seu texto e localizacao
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(255, 110, 215, 45);
		
		//Criando JLabel labelResultado e sua localizacao
		labelResultado = new JLabel();
		labelResultado.setText("");
		labelResultado.setFont(font);
		labelResultado.setHorizontalAlignment(JTextField.CENTER);
		labelResultado.setBounds(25, 175, 450, 40);
		
		//Criando JLabel labelMensagemErro, editando a cor de sua fonte e sua localizacao
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("");
		labelMensagemErro.setForeground(Color.red);
		labelMensagemErro.setBounds(90, 230, 320, 30);
		
		//Criando a funcao do botao Fahreinheit
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			//Funcao anonima do buttonFahreinheit
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Temperatura temperatura = new Temperatura();
				
				String temperaturaString = textCelsius.getText().replace(",", ".");
				double temperaturaDouble = 0;
				
				//Bloco que ira testar para ver se a entrada de dados esta correta
				try {
					
					labelMensagemErro.setText("");
					
					temperaturaDouble = Double.parseDouble(temperaturaString);
					
					temperatura.setCelsius(temperaturaDouble);
					
					temperatura.converterParaFahreinheit();
					
					//Retirando tudo que vier depois de duas casas decimais do resultado
					String resultado = String.format("%.2f", temperatura.getCelsius());
					
					//Trocando o ponto por virgula do resultado
					resultado = resultado.replace(".", ",");
					
					labelResultado.setText(resultado + " FAHREINHEIT");
				
				} 
				//Caso ocorra alguma Exception o codigo deste bloco sera executado
				catch (Exception e1) {
					
					labelMensagemErro.setText("Valor fornecido está incorreto! Tente novamente");
					labelResultado.setText("");
				}
				
			}
		});
		
		
		//Criando a funcao do botao Kelvin
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Temperatura temperatura = new Temperatura();
				String temperaturaString = textCelsius.getText().replace(",", ".");
				double temperaturaDouble = 0;
				
				
				//Bloco que ira testar para ver se a entrada de dados esta correta
				try {
					
					labelMensagemErro.setText("");
					
					temperaturaDouble = Double.parseDouble(temperaturaString);

					temperatura.setCelsius(temperaturaDouble);
					
					temperatura.converterParaKelvin();
					
					//Retirando tudo que vier depois de duas casas decimais do resultado
					String resultado = String.format("%.2f", temperatura.getCelsius());
					
					//Trocando o ponto por virgula do resultado
					resultado = resultado.replace(".", ",");
					
					labelResultado.setText(resultado + " KELVIN");
					
				} 
				//Caso ocorra alguma Exception o codigo deste bloco sera executado
				catch (Exception e2) {
					
					labelMensagemErro.setText("Valor fornecido esta incorreto! Tente novamente");
					labelResultado.setText("");
					
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
		container.add(labelMensagemErro);
		
		
		
		//Tornando a tela visivel
		tela.setVisible(true);
		
	}
}
