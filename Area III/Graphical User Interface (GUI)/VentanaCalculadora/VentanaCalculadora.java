package EjerciciosVentanas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaCalculadora extends JFrame {

	public VentanaCalculadora() {
		this.setTitle("Calculadora");
		this.setSize(460, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new FlowLayout());
		
		

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		

		p1.setLayout(new GridLayout(2,0));
		p2.setLayout(new GridLayout(1, 4));
		p3.setLayout(new FlowLayout());
		p4.setLayout(new GridLayout(4,0));
		
		

		JLabel lblnum1 = new JLabel("Numero 1: ");
		JLabel lblnum2 = new JLabel("Numero 2: ");
		
		JTextField txtnum1 = new JTextField(3);
		JTextField txtnum2 = new JTextField(3);
		
		String valor1 = txtnum1.getText();
		String valor2 = txtnum2.getText();
		
		JLabel res = new JLabel("Resultado: ");
		
		
		JButton suma = new JButton(" + "); // Suma: +
		JButton resta = new JButton(" - "); // Resta: -
		JButton multi = new JButton(" x "); // Multiplicacion:  *
		JButton division = new JButton(" ÷ "); // Division: /
		
		
		suma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try {
					int valor1 = Integer.parseInt(txtnum1.getText());
					int valor2 = Integer.parseInt(txtnum2.getText());
					int resultado1 = Suma(valor1, valor2);
					
					res.setText("El resultado de la suma es: " + resultado1);
					
				} catch (NumberFormatException cat) {
					res.setText("Valores numericos no encontrados");  // Si los valores no se introducen/ No se hayan
					
				}
					
			}

			public static int Suma(int valor1, int valor2) { 
				return valor1 + valor2;
			}
		});
		
		resta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try {
					int valor1 = Integer.parseInt(txtnum1.getText());
					int valor2 = Integer.parseInt(txtnum2.getText());
					int resultado1 = resta(valor1, valor2);
					
					res.setText("El resultado de la resta es: " + resultado1);
					
				} catch (NumberFormatException cat) {
					res.setText("Valores numericos no encontrados");
					
				}
					
			}

			public static int resta(int valor1, int valor2) { 
				return valor1 - valor2;
			}
		});
		
		multi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try {
					int valor1 = Integer.parseInt(txtnum1.getText());
					int valor2 = Integer.parseInt(txtnum2.getText());
					int resultado1 = multi(valor1, valor2);
					
					res.setText("El resultado de la multiplicacion es: " + resultado1);
					
				} catch (NumberFormatException cat) {
					res.setText("Valores numericos no encontrados");
					
				}
					
			}

			public static int multi(int valor1, int valor2) { 
				return valor1 * valor2;
			}
		});
		
		division.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try {
					int valor1 = Integer.parseInt(txtnum1.getText());
					int valor2 = Integer.parseInt(txtnum2.getText());
					int resultado1 = division(valor1, valor2);
					
					res.setText("El resultado de la division es: " + resultado1);
					
				} catch (NumberFormatException cat) {
					res.setText("Valores numericos no encontrados");
					
				}
					
			}

			public static int division(int valor1, int valor2) { 
				return valor1 / valor2;
			}
		});
		


		p1.add(lblnum1);
		p1.add(txtnum1);
		p1.add(lblnum2);
		p1.add(txtnum2);
		
		p2.add(res);
		
		p3.add(suma);
		p3.add(resta);
		p3.add(multi);
		p3.add(division);
		
		p4.add(p1);
		p4.add(p2);
		p4.add(p3);

		
		this.add(p4);

	}

}
