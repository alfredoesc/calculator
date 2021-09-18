package br.com.projeto.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		
		organizarLayout();
		
		setSize(232, 322);
		//setUndecorated(true) // para tirar a barra de titulo (botoes)
		// constante aqui (EXIT_ON_CLOSE) herdada de JFrame
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		// fazer a proporcao do display, pq de padrao ocupa bem pouco espaco
		display.setPreferredSize(new Dimension(233, 60));
		// adicionar o display no norte do layout
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		// adicionar o teclado no centro do layout
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
