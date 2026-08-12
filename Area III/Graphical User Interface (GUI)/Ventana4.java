package EjerciciosVentanas;
import java.awt.*;
import javax.swing.*;

public class Ventana4 extends JFrame {

	public Ventana4() {
		
	this.setTitle(" Registrar usuario");
	this.setSize(690,471);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(true);
	this.setLayout(new BorderLayout());
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	p1.setLayout(new GridLayout(6,0));
	p2.setLayout(new FlowLayout(FlowLayout.CENTER));
	
	String []rol = {"Alumno", "Administrador"};
	
	JLabel lblNom = new JLabel("Nombre");
	JLabel lblAp = new JLabel("Apellido");
	JLabel lblCedula =  new JLabel("Cédula");
	JLabel lblEdad = new JLabel("Edad");
	JLabel lblRol = new JLabel("Rol");
	
	JTextField txtNom = new JTextField(8);
	JTextField txtAp = new JTextField(8);
	JTextField txtCedula = new JTextField(8);
	JTextField txtEdad = new JTextField(8);
	
	JComboBox comboRol = new JComboBox(rol);
	
	JButton botonR = new JButton("Registro");
	
	p1.add(lblNom);
	p1.add(txtNom);
	p1.add(lblAp);
	p1.add(txtAp);
	p1.add(lblCedula);
	p1.add(txtCedula);
	p1.add(lblEdad);
	p1.add(txtEdad);
	p1.add(lblRol);
	p1.add(comboRol);
	
	p2.add(botonR);
	
	this.add(p1, BorderLayout.NORTH);
	this.add(p2);
	
	
	
	
	
	
	
	
	
	
		
	}
	
}
