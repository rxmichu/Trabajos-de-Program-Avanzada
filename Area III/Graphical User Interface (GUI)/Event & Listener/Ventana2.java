package EjerciciosVentanas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Ventana2 extends JFrame {
		
public Ventana2() {

this.setTitle("Ventana de Prueba - Mia Bergara");	
this.setSize(690,471);
this.setLocationRelativeTo(null);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(true);
this.setLayout(new FlowLayout());



JPanel pan1 = new JPanel();
JPanel pan2 = new JPanel();
JPanel pan3 = new JPanel();

pan1.setLayout(new GridLayout(5,2));
pan2.setLayout(new FlowLayout());
pan3.setLayout(new GridLayout(2,0));

JLabel lblBien = new JLabel("Bienvenido a mi programa");
JLabel lblNom = new JLabel("Nombre: ");
JTextField txtnom = new JTextField(8);
JLabel vacio = new JLabel (" ");
JLabel con = new JLabel("Contraseña: ");
JTextField c = new JTextField();
JButton btnAce = new JButton("Aceptar");


JButton myButton = new JButton("Guardar");

String nombre = txtnom.getName();
String contraseña = c.getText();




//Creamos un oyente para el botón
myButton.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String usr = ("El nombre es: " + txtnom.getText()  +"\n La contraseña es: " + c.getText());
		System.out.println(usr);
		//h.setText(usr);
		
		
	
	}
});








	
pan1.add(lblBien);
pan1.add(vacio);
pan1.add(lblNom);
pan1.add(txtnom);
pan1.add(con);
pan1.add(c);


pan2.add(myButton);

pan3.add(pan1);
pan3.add(pan2);


this.add(pan3);

}

}
