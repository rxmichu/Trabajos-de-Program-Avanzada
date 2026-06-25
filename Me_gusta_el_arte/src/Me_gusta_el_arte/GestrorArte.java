package Me_gusta_el_arte;

import java.util.Scanner;

public class GestrorArte {

	public static void main(String[] args) {

		Pintura pintura1 = new Pintura(null, null, null, null, null, '0');
		Escultura escultura1 = new Escultura(null, null, null, null, null, 0);
		Fotografia fotografia1 = new Fotografia(null, null, null, null, null, null);

		Pintura arregloPintura[] = new Pintura[5];
		Escultura arregloEscultura[] = new Escultura[5];
		Fotografia arregloFotografia[] = new Fotografia[5];

		Scanner lector = new Scanner(System.in);
		int opcion;

		do {

			System.out.println(" - Bienvenido al Menú -");
			System.out.println("1- Ingresar obra de arte de tipo Pintura");
			System.out.println("2- Ingresar obra de arte de tipo Escultura");
			System.out.println("3- Ingresar obra de arte de tipo Fotografía");
			System.out.println("4- Mostrar productos guardados");
			System.out.println("5- Salir");
			System.out.println("Ingresar la opcion");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1: {
				System.out.println("Ingrese el autor de la Pintura ( poner _ en lugar del espacio): ");
				String autor = lector.next();
				System.out.println("Ingrese el nombre de la Pintura: ");
				String nombre = lector.next();
				System.out.println("Ingrese la fecha en la que se completó la Pintura: ");
				String fechaCompledo = lector.next();
				System.out.println("Ingrese el movimiento artistico de la Pintura: ");
				String movimArte = lector.next();
				System.out.println("Ingrese el metodo de pintura que se utiliza \n (ej acuarelas, lapices, pintura, oleo, etc): ");
				String  metodoPintura = lector.next();
				System.out.println("Ingrese el tipo de lienzo de la Pintura (F, P,M): ");
				char tipoLienzo = lector.next().charAt(0);
				System.out.println("Datos ingresados correctamente");
				altaPintura(arregloPintura, pintura1, autor, nombre, fechaCompledo, movimArte, metodoPintura, tipoLienzo);
				break;
			}
			case 2: {
				System.out.println("Ingrese el autor de la Escultura ( poner _ en lugar del espacio): ");
				String autor = lector.next();
				System.out.println("Ingrese el nombre de la Escultura: ");
				String nombre = lector.next();
				System.out.println("Ingrese la fecha en la que se completó la Escultura: ");
				String fechaCompleto = lector.next();
				System.out.println("Ingrese el material de la Escultura");
				String material = lector.next();
				System.out.println("Ingrese el objeto representado en la Escultura");
				String objetoRepresentado = lector.next();
				System.out.println("Ingrese el transcurso de tiempo (en minutos) que tomó completar la Escultura");
				int transcursoTiempo = lector.nextInt();
				System.out.println("Datos ingresados correctamente");
				altaEscultura(arregloEscultura, escultura1, autor, nombre, fechaCompleto, material, objetoRepresentado, transcursoTiempo);
				break;
				
			}

			case 3: {
				System.out.println("Ingrese el autor de la Fotografia ( poner _ en lugar del espacio): ");
				String autor = lector.next();
				System.out.println("Ingrese el nombre de la Fotografia: ");
				String nombre = lector.next();
				System.out.println("Ingrese la fecha en la que se completó la Fotografia: ");
				String fechaCompleto = lector.next();	
				System.out.println("Ingrese una palabra que se refiera a la tematica de la Fotografia: ");
				String tematica = lector.next();
				System.out.println("Ingrese el formato de la Fotografia: ");
				String formato = lector.next();
				System.out.println("Ingrese el tipo de resolucion de la Fotografia (baja, media, alta): ");
				String tipoResolucion = lector.next();
				System.out.println("Datos ingresados correctamente");
				altaFotografia(arregloFotografia, fotografia1, autor, nombre, fechaCompleto, tematica, formato, tipoResolucion);
				break;

			}

			case 4: {
				System.out.println("Los datos de las Obras de Arte son:  ");
				listarPintura(arregloPintura);
				listarEscultura(arregloEscultura);
				listarFotografia(arregloFotografia);
			}
			}

		} while (opcion != 5);

	}

	public static void altaPintura(Pintura[] ar, Pintura pint, String autor, String nombreObra, String fechaCompletado,
			String movimArt, String metodoPintura, char tipoLienzo) {

		pint.setAutor(autor);
		pint.setNombreObra(nombreObra);
		pint.setFechaCompletado(fechaCompletado);
		pint.setMovimArte(movimArt);
		pint.setMetodoPintura(metodoPintura);
		pint.setTipoLienzo('0');

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Pintura(autor, nombreObra, fechaCompletado, movimArt, metodoPintura, '0');

				System.out.println("Datos de Pintura guardados");
				break;
			}
		}

	}

	public static void altaEscultura(Escultura[] ar, Escultura esc, String autor, String nombreObra,
			String fechaCompletado, String material, String objetorepresentado, int transcursoTiempo) {

		esc.setAutor(autor);
		esc.setNombreObra(nombreObra);
		esc.setFechaCompletado(fechaCompletado);
		esc.setMaterial(material);
		esc.setObjetoRepresentado(objetorepresentado);
		esc.setTranscursoTiempo(transcursoTiempo);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Escultura(autor, nombreObra, fechaCompletado, material, objetorepresentado,
						transcursoTiempo);

				System.out.println("Datos de Pintura guardados");
				break;
			}
		}
	}

	public static void altaFotografia(Fotografia[] ar, Fotografia foto, String autor, String nombreObra,
			String fechaCompletado, String tematica, String formato, String tipoResolucion) {

		foto.setAutor(autor);
		foto.setNombreObra(nombreObra);
		foto.setFechaCompletado(fechaCompletado);
		foto.setTematica(tematica);
		foto.setFormato(formato);
		foto.setTipoResolucion(tipoResolucion);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Fotografia(autor, nombreObra, fechaCompletado, tematica, formato, tipoResolucion);

				System.out.println("Datos de Fotografia guardados");
				break;
			}
		}
	}

	public static void listarPintura(Pintura[] p) {

		for (int i = 0; i < p.length; i++) {

			if (p[i] != null) {
				System.out.println(" Obra de arte de tipo Pintura: " + " Pos N°: " + i + " Autor: " + p[i].getAutor()
						+ " Nombre de la obra: " + p[i].getNombreObra() + " Fecha de completado: "
						+ p[i].getFechaCompletado() + " Movimiento de arte: " + p[i].getMovimArte()
						+ " Método de pintura: " + p[i].getMetodoPintura() + " Tipo de lienzo: "
						+ p[i].getTipoLienzo());

			}

		}

	}

	public static void listarEscultura(Escultura[] e) {
		for (int i = 0; i < e.length; i++) {

			if (e[i] != null) {
				System.out.println(" Obra de arte de tipo Escultura:  " + " Pos N°: " + i + " Autor " + e[i].getAutor()
						+ " Nombre de obra: " + e[i].getNombreObra() + " Fecha de completado: "
						+ e[i].getFechaCompletado() + " Material: " + e[i].getMaterial() + " Objeto representado: "
						+ e[i].getObjetoRepresentado() + " Transcurso de tiempo: " + e[i].getTranscursoTiempo());

			}
		}
	}

	public static void listarFotografia(Fotografia[] f) {
		for (int i = 0; i < f.length; i++) {

			if (f[i] != null) {
				System.out.println(" Obra de arte de tipo Fotografia:  " + " Pos N°: " + i + " Autor " + f[i].getAutor()
						+ " Nombre de obra: " + f[i].getNombreObra() + " Fecha de completado: "
						+ f[i].getFechaCompletado() + " Tematica de la Fotografia: " + f[i].getTematica() + " Formato: "
						+ f[i].getFormato() + " Tipo de resolucion: " + f[i].getTipoResolucion());

			}
		}
	}
}
