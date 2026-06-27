package Supermercado;

import java.util.Scanner;

public class Gestor_Super {

	public static void main(String[] args) {

		Electronica electronica1 = new Electronica(0, null, null, null, null, null);
		Ropa ropa1 = new Ropa(0, null, null, null, 0, null);
		Alimento alimento1 = new Alimento(0, null, null, null, 0, null);

		Electronica arregloElectro[] = new Electronica[10];
		Ropa arregloRopa[] = new Ropa[10];
		Alimento arregloAlimento[] = new Alimento[10];

		Scanner lector = new Scanner(System.in);
		int opcion;

		do {

			System.out.println("Bienvenido al supermercado");
			System.out.println("1. Ingresar producto tipo Electronico");
			System.out.println("2. Ingresar producto tipo Ropa ");
			System.out.println("3. Ingresar producto tipo Alimento ");
			System.out.println("4. Mostrar productos guardados");
			System.out.println("5. Borrar producto Electronico");
			System.out.println("6. Borrar producto Ropa");
			System.out.println("7. Borrar producto Alimento");
			System.out.println("8. Modificar producto Electronico ");
			System.out.println("9. Modiicar producto Ropa");
			System.out.println("10. Modificar producto Alimento ");
			System.out.println("11. Salir");
			System.out.println("Ingresar la opcion");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1: {
				// electronico
				System.out.println("Ingrese el id numerico del producto: ");
				int id = lector.nextInt();
				System.out.println("Ingrese la marca del producto: ");
				String marca = lector.next();
				System.out.println("Ingrese el nombre del producto: ");
				String nombre = lector.next();
				System.out.println("Ingrese el sistema operativo");
				String sisemtOp = lector.next();
				System.out.println("Ingrese uso del aparato: ");
				String usoAparato = lector.next();
				System.out.println("Ingrese tipo de alimentacion: ");
				String tipoAlimentacion = lector.next();
				System.out.println("Datos ingresados correctamente: ");
				altaElectro(arregloElectro, electronica1, id, marca, nombre, sisemtOp, usoAparato, tipoAlimentacion);
				break;
			}
			case 2: {
				// ropa
				System.out.println("Ingrese el id numerico del producto: ");
				int id = lector.nextInt();
				System.out.println("Ingrese la marca del producto: ");
				String marca = lector.next();
				System.out.println("Ingrese el nombre del producto: ");
				String nombre = lector.next();
				System.out.println("Ingrese el tipo de material: ");
				String tipoTextil = lector.next();
				System.out.println("Ingrese el talle numerico: ");
				int talle = lector.nextInt();
				System.out.println("Ingrese el color del porducto: ");
				String color = lector.next();
				System.out.println("Datos ingresados correctamente: ");
				altaRopa(arregloRopa, ropa1, id, marca, nombre, tipoTextil, talle, color);
				break;
			}
			case 3: {
				// alimento
				System.out.println("Ingrese el id numerico del producto: ");
				int id = lector.nextInt();
				System.out.println("Ingrese la marca del producto: ");
				String marca = lector.next();
				System.out.println("Ingrese el nombre del producto: ");
				String nombre = lector.next();
				System.out.println("Ingrese la fecha de vencimiento: ");
				String fechaVencimiento = lector.next();
				System.out.println("Ingrese el numero de lote (dato numerico) : ");
				int lote = lector.nextInt();
				System.out.println("Ingrese el tipo de alimento que es este producto: ");
				String alim = lector.next();
				System.out.println("Datos ingresados correctamente: ");
				altaAlimento(arregloAlimento, alimento1, id, marca, nombre, fechaVencimiento, lote, alim);
				break;

			}
			case 4: {
				System.out.println("Los datos de los productos son:  ");
				listarElectro(arregloElectro);
				listarRopa(arregloRopa);
				listarAlimento(arregloAlimento);
				break;
			}

			case 5: { // borrar
				System.out.println("Ingresa el id del producto Electronico a borrar: ");
				int bajaElectronica = lector.nextInt();
				bajaElectronica(arregloElectro, bajaElectronica);
				break;

			}

			case 6: {
				System.out.println("Ingresa el id del producto Ropa a borrar: ");
				int bajaRopa = lector.nextInt();
				bajaRopa(arregloRopa, bajaRopa);
				break;
			}

			case 7: {
				System.out.println("Ingresa el id del producto Alimento a borrar: ");
				int bajaAliemnto = lector.nextInt();
				bajaAlimento(arregloAlimento, bajaAliemnto);
				break;
			}

			case 8: { // modificar electro
				int id = 0;
				String m = "";
				System.out.println("Ingresa el Nro de id del producto a modificar: ");
				int idActual = lector.nextInt();
				System.out.println("Ingrese el dato que deseas modificar:");
				System.out.println("Recuerde que solo puede ser el id o la marca");
				System.out.println("1. id");
				System.out.println("2. Marca");
				int datoAModificar = lector.nextInt();
				if (datoAModificar == 1) {
					System.out.println("Ingresa nuevo id: ");
					id = lector.nextInt();
				} else {
					System.out.println("Ingresa nueva marca:");
					m = lector.next();
				}
				{
					System.out.println(" Dato modificado.");
				}
				modificarElectronica(arregloElectro, idActual, datoAModificar, id, m);

				break;

			}
			case 9: { // modificar ropa

				int id = 0;
				String m = "";
				System.out.println(" Ingrese el Nro de id del producto que desea modificar: ");
				int idActual = lector.nextInt();
				System.out.println("Ingrese el dato que deseas modificar:");
				System.out.println("Recuerde que solo puede ser el id o la marca");
				System.out.println("1. id");
				System.out.println("2. Marca");
				int datoAModificar = lector.nextInt();
				if (datoAModificar == 1) {
					System.out.println("Ingresa nuevo id: ");
					id = lector.nextInt();
				} else {
					System.out.println("Ingresa nueva marca:");
					m = lector.next();
				}
				{
					System.out.println("Dato modificado.");
				}
				modificarRopa(arregloRopa, idActual, datoAModificar, id, m);

				break;
			}

			case 10: { //modificar alimento
				
				int id = 0;
				String m = "";
				System.out.println(" Ingrese el Nro de id del producto que desea modificar: ");
				int idActual = lector.nextInt();
				System.out.println("Ingrese el dato que deseas modificar:");
				System.out.println("1. id");
				System.out.println("2. Marca");
				int datoAModificar = lector.nextInt();
				if (datoAModificar == 1) {
					System.out.println("Ingresa nuevo id: ");
					id = lector.nextInt();
				} else {
					System.out.println("Ingresa nueva marca:");
					m = lector.next();
				}
				{
					System.out.println("Dato modificado.");
				}
				modificarAlimento(arregloAlimento, idActual, datoAModificar, id, m);

				break;
				
			}

			}
		} while (opcion != 11);
	}

	public static void altaElectro(Electronica[] ar, Electronica elec, int id, String m, String n, String sistemOp,
			String usoAparato, String tipoAlimentacion) {

		elec.setId(id);
		elec.setMarca(m);
		elec.setNombre(n);
		elec.setSistemOp(sistemOp);
		elec.setUsoAparato(usoAparato);
		elec.setTipoAlimentacion(tipoAlimentacion);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Electronica(id, m, n, sistemOp, usoAparato, tipoAlimentacion);

				System.out.println("Electronico guardado");
				break;
			}
		}
	}

	public static void altaRopa(Ropa[] ar, Ropa r, int id, String m, String n, String textil, int talle, String color) {

		r.setId(id);
		r.setMarca(m);
		r.setNombre(n);
		r.setTipoTextil(textil);
		r.setTalle(talle);
		r.setColor(color);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Ropa(id, m, n, textil, talle, color);

				System.out.println("Ropa guardada");
				break;
			}

		}
	}

	public static void altaAlimento(Alimento[] ar, Alimento a, int id, String m, String n, String fechaVencimiento,
			int lote, String alim) {

		a.setId(id);
		a.setMarca(m);
		a.setNombre(n);
		a.setFechaVencimiento(fechaVencimiento);
		a.setLote(lote);
		a.setAlim(alim);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Alimento(id, m, n, fechaVencimiento, lote, alim);

				System.out.println("Alimento guardado");
				break;
			}

		}

	}

	public static void listarElectro(Electronica[] elec) {

		for (int i = 0; i < elec.length; i++) {

			if (elec[i] != null) {
				System.out.println("Producto electronico :" + "Pos. N°" + i + " Id: " + elec[i].getId() + " Marca: "
						+ elec[i].getMarca() + " Nombre: " + elec[i].getNombre() + " Sistem Operativo: "
						+ elec[i].getSistemOp() + " Uso del aparato: " + elec[i].getUsoAparato()
						+ " Tipo de alimentación del producto: " + elec[i].getTipoAlimentacion());
			}
		}

	}

	public static void listarRopa(Ropa[] r) {

		for (int i = 0; i < r.length; i++) {

			if (r[i] != null) {
				System.out.println("Producto Ropa :" + " Pos. N°" + i + " Id: " + r[i].getId() + " Marca: "
						+ r[i].getMarca() + " Nombre: " + r[i].getNombre() + " Tipo textil: " + r[i].getTipoTextil()
						+ " Talle: " + r[i].getTalle() + " Color de la ropa: " + r[i].getColor());
			}
		}

	}

	public static void listarAlimento(Alimento[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {
				System.out.println("Producto Alimento :" + " Pos. N°" + i + " Id: " + a[i].getId() + " Marca: "
						+ a[i].getMarca() + " Nombre: " + a[i].getNombre() + " Fecha de vencimiento: "
						+ a[i].getFechaVencimiento() + " Lote: " + a[i].getLote() + " Tipo de Alimento: "
						+ a[i].getAlim());
			}
		}

	}

	public static void bajaElectronica(Electronica[] elec, int bajaElectronica) {

		for (int i = 0; i < elec.length; i++) {

			if (elec[i].getId() == bajaElectronica) {
				elec[i] = null;
				System.out.println("Producto Electronico borrado.");
			}
			break;

		}

	}

	public static void bajaRopa(Ropa[] r, int bajaRopa) {

		for (int i = 0; i < r.length; i++) {

			if (r[i].getId() == bajaRopa) {
				r[i] = null;
				System.out.println("Producto Ropa borrado.");
			}
			break;
		}
	}

	public static void bajaAlimento(Alimento[] ali, int bajaAlimento) {

		for (int i = 0; i < ali.length; i++) {

			if (ali[i].getId() == bajaAlimento) {
				ali[i] = null;
				System.out.println("Producto Alimento borrado.");
			}
			break;
		}
	}

	public static void modificarElectronica(Electronica[] elec, int idActual, int datoAModificar, int nuevoId,
			String marcaAModificar) {

		System.out.println("Id de Electronico modificado: " + idActual);
		for (int i = 0; i < elec.length; i++) {
			if (elec[i] != null && elec[i].getId() == idActual) {

				if (datoAModificar == 1) {
					elec[i].setId(nuevoId);

				} else {

					elec[i].setMarca(marcaAModificar);
					break;
				}

			}
		}
	}

	public static void modificarRopa(Ropa[] r, int idActual, int datoAModificar, int nuevoId, String marcaAModificar) {

		System.out.println("Id de la Ropa modificada: " + idActual);
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null && r[i].getId() == idActual) {

				if (datoAModificar == 1) {
					r[i].setId(nuevoId);

				} else {

					r[i].setMarca(marcaAModificar);
					break;

				}
			}
		}
	}
	
	public static void modificarAlimento(Alimento[] ali, int idActual, int datoAModificar, int nuevoId, String marcaAModificar) {

		System.out.println("Id de el Alimento modificado: " + idActual);
		for (int i = 0; i < ali.length; i++) {
			if (ali[i] != null && ali[i].getId() == idActual) {

				if (datoAModificar == 1) {
					ali[i].setId(nuevoId);

				} else {

					ali[i].setMarca(marcaAModificar);
					break;

				}
			}
		}
	}
}
