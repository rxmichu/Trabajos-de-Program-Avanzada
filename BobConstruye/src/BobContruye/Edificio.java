package BobContruye;

public abstract class Edificio {

String nombre;	
int numHabitantes;
int numero;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getNumHabitantes() {
	return numHabitantes;
}
public void setNumHabitantes(int numHabitantes) {
	this.numHabitantes = numHabitantes;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public Edificio(String nombre, int numHabitantes, int numero) {
	super();
	this.nombre = nombre;
	this.numHabitantes = numHabitantes;
	this.numero = numero;
}




}



