package br.dev.viniciusjulio.temperatura.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.viniciusjulio.temperatura.model.Temperatura;

public class TelaConversor {

	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	private Font labels = new Font("BankGothic Lt BT", Font.PLAIN, 20);
	private Color labelsColor = new Color(230, 0, 0);

	public void criarTelaConversor() {

		JFrame tela = new JFrame();

		// Definido o tamanho da tela
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);

		// criando o JLabel e o JTextField para o celsius
		labelCelsius = new JLabel();
		labelCelsius.setFont(labels);
		labelCelsius.setText("Digite o valor em celsius para converter");
		labelCelsius.setBounds(75, 30, 450, 50);

		textCelsius = new JTextField();
		textCelsius.setFont(labels);
		textCelsius.setBounds(75, 80, 450, 50);
		textCelsius.setHorizontalAlignment(JTextField.CENTER);

		// Criando o JButton para o Kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setBounds(75, 140, 220, 50);
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setFont(labels);

		// Criando o JButton para o Fahreinheit
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setBounds(305, 140, 220, 50);
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setFont(labels);

		// Criando o JLabel para o Resultado
		labelResultado = new JLabel();
		labelResultado.setText(null);
		labelResultado.setBounds(180, 200, 250, 30);
		labelResultado.setFont(labels);

		// Criando o JLabel para a mensagem de Erro
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText(null);
		labelMensagemErro.setBounds(75, 260, 450, 30);
		labelMensagemErro.setFont(labels);
		labelMensagemErro.setForeground(labelsColor);
		

		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);

		// adicionar um ouvinte de ação (Listener) ao botão calcular
		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Temperatura temperatura = new Temperatura();

				try {
					double celsius = Double.parseDouble(textCelsius.getText());
					temperatura.setCelsius(celsius);
					double kelvin = temperatura.converterParaKelvin();
					labelResultado.setText(kelvin + " Kelvin");

				} catch (Exception erro) {
					labelResultado.setText("");
					labelMensagemErro.setText("valor invalido! Digite Somente numeros.");
				}

			}
		});

		buttonFahreinheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Temperatura temperatura = new Temperatura();

				try {
					double celsius = Double.parseDouble(textCelsius.getText());
					temperatura.setCelsius(celsius);
					double fahreinheit = temperatura.converterParaFahreinheit();
					labelResultado.setText(fahreinheit + " Fahreinheit");

				} catch (Exception erro) {
					labelResultado.setText("");
					labelMensagemErro.setText("valor invalido! Digite Somente numeros.");
				}

			}
		});

		tela.setVisible(true);

	}

}

//https://docs.google.com/spreadsheets/d/1WkP3qzOXKJuUA2akXTST8pXPe-PmwpYCyTpig1FLRcU/edit?pli=1&gid=0#gid=0
