package BobContruye;

import java.util.Scanner;

public class GestorBob {

	public static void main(String[] args) {

		Casa casa1 = new Casa(null, 0, 0, null, 0, null);
		Apartamento apartamento1 = new Apartamento(null, 0, 0, null, 0, null);

		Casa arregloCasa[] = new Casa[5];
		Apartamento arregloApa[] = new Apartamento[5];

		Scanner lector = new Scanner(System.in);
		int opcion;

		do {

			System.out.println("Bienvenido al sistema");
			System.out.println("1). Ingresar  Casa");
			System.out.println("2). Ingresar Apartamento ");
			System.out.println("3). Mostrar datos guardados");
			System.out.println("4). Borrar datos guardados");
			System.out.println("5). Modificar datos guardados");
			System.out.println("6. Salir");
			System.out.println("Ingresar la opcion");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1: { // casa
				System.out.println("Ingrese el nombre de la casa ( poner _ en lugar del espacio): ");
				String nombre = lector.next();
				System.out.println("Ingrese el numero de habitantes de la casa: ");
				int numHabitantes = lector.nextInt();
				System.out.println("Ingrese el numero de la casa:");
				int numero = lector.nextInt();
				System.out.println("Ingrese el barrio de la casa: ");
				String barrio = lector.next();
				System.out.println("Ingrese el numero de habitaciones de la casa: ");
				int numHabitacion = lector.nextInt();
				System.out.println("Ingrese el nombre del propietario de la casa ( poner _ en lugar del espacio): ");
				String propietario = lector.next();
				altaCasa(arregloCasa, casa1, nombre, numHabitantes, numero, barrio, numHabitacion, propietario);
				break;
			}

			case 2: { // apartamento

				System.out.println("Ingrese el nombre del apartamento ( poner _ en lugar del espacio): ");
				String nombre = lector.next();
				System.out.println("Ingrese el numero de habitantes del apartamento: ");
				int numHabitantes = lector.nextInt();
				System.out.println("Ingrese el numero del apartamento: ");
				int numero = lector.nextInt();
				System.out.println("Ingrese el departamento en el que se ubica el apartamento: ");
				String departamento = lector.next();
				System.out.println("Ingrese el numero de piso en el que se ubica el apartamento ");
				int numPiso = lector.nextInt();
				System.out.println("Ingrese el color del apartamento: ");
				String color = lector.next();
				altaApartamento(arregloApa, apartamento1, nombre, numHabitantes, numero, departamento, numPiso, color);
				break;
			}
			case 3: { // muestreo

				System.out.println("Datos guardados: ");
				listarCasa(arregloCasa);
				listarApartamento(arregloApa);
				break;
			}
			case 4: { // borrar
				System.out.println("Seleccione el tipo de dato que desea eliminar: ");
				System.out.println("1). Casa");
				System.out.println("2). Apartamento ");
				int baja = lector.nextInt();
				if (baja == 1) {
					System.out.println("Seleccione el numero de la Casa que desea borrar: ");
					int bajaCasa = lector.nextInt();
					borrarCasa(arregloCasa, bajaCasa);
				}
				if (baja == 2) {
					System.out.println("Ingrese el numero de el Apartamento que desea borrar: ");
					int bajaApa = lector.nextInt();
					borrarApartamento(arregloApa, bajaApa);
					break;
				}

			}

			case 5: {
				int numero = 0;
				String nombre = "";
				int modificar;
				System.out.println("Selecciona el tipo de hogar a modficar: ");
				System.out.println("1). Casa");
				System.out.println("2). Apartamento ");
				modificar = lector.nextInt();
				if (modificar == 1) {
					System.out.println("Ingrese el numero de la casa a modificar: ");
					int numeroActual = lector.nextInt();
					System.out.println("Ingresa el dato que desea modificar: ");
					System.out.println("1). Numero ");
					System.out.println("2). Nombre");
					int datoAModificar = lector.nextInt();
					if (datoAModificar == 1) {
						System.out.println(" Ingrese el nuevo numero: ");
						numero = lector.nextInt();
					} else {
						System.out.println("Ingresa nuevo nombre ( poner _ en lugar del espacio): ");
						nombre = lector.next();
					}
					modificarCasa(arregloCasa, numeroActual, datoAModificar, numero, nombre);
				} else if (modificar == 2) {
					System.out.println(" Ingrese el numero de el apartamento a modificar");
					int numeroActual = lector.nextInt();
					System.out.println("Ingresa el dato que desea modificar: ");
					System.out.println("1). Numero ");
					System.out.println("2). Nombre");
					int datoAModificar = lector.nextInt();
					if (datoAModificar == 1) {
						System.out.println(" Ingrese el nuevo numero: ");
						numero = lector.nextInt();
					} else {
						System.out.println("Ingresa nuevo nombre: ");
						nombre = lector.next();
					}
					modificarApa(arregloApa, numeroActual, datoAModificar, numero, nombre);
					break;
				}

			}
			}

		} while (opcion != 6);

	}

	public static void altaCasa(Casa[] ar, Casa casa, String nombre, int numHabitantes, int numero, String barrio,
			int numHabitacion, String propietrio) {

		casa.setNombre(nombre);
		casa.setNumHabitacion(numHabitacion);
		casa.setNumero(numero);
		casa.setBarrio(barrio);
		casa.setNumHabitacion(numHabitacion);
		casa.setPropietario(propietrio);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Casa(nombre, numHabitantes, numero, barrio, numHabitacion, propietrio);

				System.out.print("Datos de casa guardados");
				break;
			}
		}
	}

	public static void altaApartamento(Apartamento[] ar, Apartamento apa, String nombre, int numHabitantes, int numero,
			String departamento, int numPiso, String color) {

		apa.setNombre(nombre);
		apa.setNumHabitantes(numHabitantes);
		apa.setNumero(numero);
		apa.setDepartamento(departamento);
		apa.setNumPiso(numPiso);
		apa.setColor(color);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Apartamento(nombre, numHabitantes, numero, departamento, numPiso, color);

				System.out.print("Datos de apartamento guardados");
				break;
			}
		}
	}

	public static void listarCasa(Casa[] casa) {

		for (int i = 0; i < casa.length; i++) {
			if (casa[i] != null) {
				System.out.println(" Casa: " + " Pos N°: " + i + " Nombre: " + casa[i].getNombre()
						+ " Número de habitantes: " + casa[i].getNumHabitantes() + " Número de la casa: "
						+ casa[i].getNumero() + " Barrio: " + casa[i].getBarrio() + " Número de habitaciones: "
						+ casa[i].getNumHabitacion() + " Propietario: " + casa[i].getPropietario());
			}
		}

	}

	public static void listarApartamento(Apartamento[] apa) {

		for (int i = 0; i < apa.length; i++) {
			if (apa[i] != null) {
				System.out.println(" Apartamento: " + " Pos N°: " + i + " Nombre: " + apa[i].getNombre()
						+ " Número de habitantes: " + apa[i].getNumHabitantes() + " Número del apartamento: "
						+ apa[i].getNumero() + " Departamento: " + apa[i].getDepartamento() + " Número de piso: "
						+ apa[i].getNumPiso() + " Color: " + apa[i].getColor());
			}
		}

	}

	public static void borrarCasa(Casa[] c, int bajaCasa) {
		for (int i = 0; i < c.length; i++) {
			if (c[i].getNumero() == bajaCasa) {
				c[i] = null;
				System.out.println("Casa borrada.");
			} else {
				System.out.println("No se logró borrar");
				break;
			}

		}
	}

	public static void borrarApartamento(Apartamento[] apa, int bajaApa) {
		for (int i = 0; i < apa.length; i++) {
			if (apa[i].getNumero() == bajaApa) {
				apa[i] = null;
				System.out.println("Apartamento borrado.");
			} else {
				System.out.println("No se logró borrar");
				break;
			}

		}

	}

	public static void modificarCasa(Casa[] c, int numeroActual, int datoAModificar, int nuevoNum,
			String nombreAModificar) {

		System.out.println("Numero de la Casa modificada: " + numeroActual);
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getNumero() == numeroActual) {

				if (datoAModificar == 1) {
					c[i].setNumero(nuevoNum);

				} else {

					c[i].setNombre(nombreAModificar);

					break;
				}
			}
		}
	}

	public static void modificarApa(Apartamento[] a, int numeroActual, int datoAModificar, int nuevoNum,
			String nombreAModificar) {

		System.out.println("Numero del Apartamento modificado: " + numeroActual);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getNumero() == numeroActual) {

				if (datoAModificar == 1) {
					a[i].setNumero(nuevoNum);

				} else {

					a[i].setNombre(nombreAModificar);
					;
					break;
				}
			}
		}
	}

}