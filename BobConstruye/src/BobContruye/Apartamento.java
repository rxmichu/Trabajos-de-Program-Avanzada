package BobContruye;

public class Apartamento extends Edificio {
	
String departamento;	
int numPiso;
String color;

public String getDepartamento() {
	return departamento;
}
public void setDepartamento(String departamento) {
	this.departamento = departamento;
}
public int getNumPiso() {
	return numPiso;
}
public void setNumPiso(int numPiso) {
	this.numPiso = numPiso;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Apartamento(String nombre, int numHabitantes, int numero, String departamento, int numPiso, String color) {
	super(nombre, numHabitantes, numero);
	this.departamento = departamento;
	this.numPiso = numPiso;
	this.color = color;
}




}
