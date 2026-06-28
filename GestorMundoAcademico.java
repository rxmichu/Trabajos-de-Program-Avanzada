package mundoAcademico;

import java.util.Scanner;

public class GestorMundoAcademico {

	public static void main(String[] args) {

		Libro libro1 = new Libro(0, null, null, null, null, null, null, null);
		Revista revista1 = new Revista(0, null, null, null, null, null, 0, null);
		ArticuloCientifico artcien1 = new ArticuloCientifico(0, null, null, null, null, null, null, null);

		Libro arregloLibro[] = new Libro[5];
		Revista arregloRevista[] = new Revista[5];
		ArticuloCientifico arregloArtCien[] = new ArticuloCientifico[5];

		Scanner lector = new Scanner(System.in);
		int opcion;

		do {

			System.out.println("¡Bienvenido al Mundo Academico!");
			System.out.println("1°| Ingresar una publicacion de tipo Libro");
			System.out.println("2°| Ingresar una publicacion de tipo Revista");
			System.out.println("3°| Ingresar una publicacion de tipo Articulo Cientifico ");
			System.out.println("4°| Mostrar datos guardados de las Publicaciones");
			System.out.println("5°| Borrar una publicacion");
			System.out.println("6°| Modificar publicacion de tipo Libro");
			System.out.println("7°| Modificar publicacion de tipo Revista");
			System.out.println("8°| Modificar publicacion de tipo Articulo Cientifico");
			System.out.println("9°| Salir");
			System.out.println("Ingresar la opcion");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1: {
				System.out.println("Ingrese el id del Libro: ");
				int id = lector.nextInt();
				lector.nextLine();
				System.out.println("Ingrese el titulo del Libro ( poner _ en lugar del espacio): ");
				String titulo = lector.next();
				System.out.println("Ingrese la feha del Libro: ");
				String fecha = lector.next();
				System.out.println("Ingrese el idioma del Libro: ");
				String idioma = lector.next();
				System.out.println("Ingrese la URL del Libro: ");
				String url = lector.next();
				System.out.println("Ingrese el ISBN del Libro: ");
				String isbn = lector.next();
				System.out.println("Ingrese la editorial del Libro: ");
				String editorial = lector.next();
				System.out.println("Ingrese el numero de paginas del Libro: ");
				String numeroPaginas = lector.next();
				System.out.println("Datos ingresados correctamente");
				altaLibro(arregloLibro, libro1, id, titulo, fecha, idioma, url, isbn, editorial, numeroPaginas);
				break;
			}
			case 2: {

				System.out.println("Ingrese el id de la Revista: ");
				int id = lector.nextInt();
				lector.nextLine();
				System.out.println("Ingrese el titulo de la Revista ( poner _ en lugar del espacio): ");
				String titulo = lector.next();
				System.out.println("Ingrese la fecha de la Revista: ");
				String fecha = lector.next();
				System.out.println("Ingrese el idioma de la Revista: ");
				String idioma = lector.next();
				System.out.println("Ingrese la URL de la Revista: ");
				String url = lector.next();
				System.out.println("Ingrese el ISSN de la Revista: ");
				String issn = lector.next();
				System.out.println("Ingrese el volumen de la Revista: ");
				int volumen = lector.nextInt();
				System.out.println("Ingrese el editor de la Revista ( poner _ en lugar del espacio): ");
				String editor = lector.next();
				System.out.println("Datos ingresados correctamente");
				altaRevista(arregloRevista, revista1, id, titulo, fecha, idioma, url, issn, volumen, editor);
				break;

			}
			case 3: {

				System.out.println("Ingrese el id del Articulo Cientifico: ");
				int id = lector.nextInt();
				lector.nextLine();
				System.out.println("Ingrese el titulo del Articulo Cientifico ( poner _ en lugar del espacio): ");
				String titulo = lector.next();
				System.out.println("Ingrese la fecha del Articulo Cientifico: ");
				String fecha = lector.next();
				System.out.println("Ingrese el idioma del Articulo Cientifico: ");
				String idioma = lector.next();
				System.out.println("Ingrese el URL del Articulo Cientifico: ");
				String url = lector.next();
				System.out.println("Ingrese el DOI del Articulo Cientifico: ");
				String doi = lector.next();
				System.out.println("Ingrese la universidad encargada del Articulo Cientifico: ");
				String universidad = lector.next();
				System.out.println("Ingrese el area de estudio del Articulo Cientifico: ");
				String areaEstudio = lector.next();
				System.out.println("Datos ingresados correctamente");
				altaArticulo(arregloArtCien, artcien1, id, titulo, fecha, idioma, url, doi, universidad, areaEstudio);
				break;
			}
			case 4: {
				System.out.println("Datos guardados de las publicaciones: ");
				listarLibro(arregloLibro);
				listarRevista(arregloRevista);
				listarArtcien(arregloArtCien);
				break;
			}

			case 5: { // borrar
				System.out.println("Seleccione el tipo de publicacion que desea borrar");
				System.out.println("1°| Libro");
				System.out.println("2°| Revista");
				System.out.println("3°| Articulo Cientifico");
				int baja = lector.nextInt();
				if (baja == 1) {
					System.out.println("Ingresa el id del Libro a borrar:");
					int bajaId = lector.nextInt();
					bajaLibro(arregloLibro, bajaId);
				}
				if (baja == 2) {
					System.out.println("Ingresa el id de la Revista a borrar: ");
					int bajaId = lector.nextInt();
					bajaRevista(arregloRevista, bajaId);
				}
				if (baja == 3) {
					System.out.println("Ungresa el id de el Articulo Cientifico a borrar: ");
					int bajaId = lector.nextInt();
					bajaArticulo(arregloArtCien, bajaId);
				} else {
					System.out.println("Esa opcion no es valida.");
				}
				break;
			}

			case 6: {
				int id = 0;
				String t = "";
				System.out.println("Ingresa el numero de id del Libro a modificar: ");
				int idActual = lector.nextInt();
				System.out.println("Ingrese el dato que desea modificar: ");
				System.out.println("1°| Id");
				System.out.println("2°| Titulo");
				int datoAModificar = lector.nextInt();
				if (datoAModificar == 1) {
					System.out.println("Ingresa nuevo id:  ");
					id = lector.nextInt();

				} else {
					System.out.println(" Ingresa nuevo titulo: ");
					t = lector.next();
				}
				{
					System.out.println("Dato modificado");
				}
				modificarLibro(arregloLibro, idActual, datoAModificar, id, t);
				break;
			}
			case 7: {
				int id = 0;
				String t = "";
				System.out.println("Ingresa el id de la Revista a modificar: ");
				int idActual = lector.nextInt();
				System.out.println("Ingrese el dato que desea modificar: ");
				System.out.println("1°| Id");
				System.out.println("2°| Titulo");
				int datoAModificar = lector.nextInt();
				if (datoAModificar == 1) {
					System.out.println("Ingresa nuevo id:  ");
					id = lector.nextInt();

				} else {
					System.out.println(" Ingresa nuevo titulo: ");
					t = lector.next();
				}
				{
					System.out.println("Dato modificado");
				}
				modificarRevista(arregloRevista, idActual, datoAModificar, id, t);
				break;

			}
			case 8: {
				int id = 0;
				String t = "";
				System.out.println("Ingresa el numero de id del Articulo Cientifico a modificar: ");
				int idActual = lector.nextInt();
				System.out.println("Ingrese el dato que desea modificar: ");
				System.out.println("1°| Id");
				System.out.println("2°| Titulo");
				int datoAModificar = lector.nextInt();
				if (datoAModificar == 1) {
					System.out.println("Ingresa nuevo id:  ");
					id = lector.nextInt();

				} else {
					System.out.println(" Ingresa nuevo titulo: ");
					t = lector.next();
				}
				{
					System.out.println("Dato modificado");
				}
				modificarArticulo(arregloArtCien, idActual, datoAModificar, id, t);
				break;

			}
			}
		} while (opcion != 9);
	}

	public static void altaLibro(Libro[] ar, Libro libro, int id, String titulo, String fecha, String idioma,
			String url, String isbn, String editorial, String numeroPagina) {

		libro.setId(id);
		libro.setTitulo(titulo);
		libro.setFecha(fecha);
		libro.setIdioma(idioma);
		libro.setUrl(url);
		libro.setIsbn(isbn);
		libro.setEditorial(editorial);
		libro.setNumeroPaginas(numeroPagina);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Libro(id, titulo, fecha, idioma, url, isbn, editorial, numeroPagina);

				System.out.println("Datos del Libro guardados");
				break;
			}
		}

	}

	public static void altaRevista(Revista[] ar, Revista revista, int id, String titulo, String fecha, String idioma,
			String url, String issn, int volumen, String editor) {

		revista.setId(id);
		revista.setTitulo(titulo);
		revista.setFecha(fecha);
		revista.setIdioma(idioma);
		revista.setUrl(url);
		revista.setIssn(issn);
		revista.setVolumen(volumen);
		revista.setEditor(editor);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Revista(id, titulo, fecha, idioma, url, issn, volumen, editor);

				System.out.println("Datos e la Revista guardados");
				break;
			}
		}

	}

	public static void altaArticulo(ArticuloCientifico[] ar, ArticuloCientifico artcien, int id, String titulo,
			String fecha, String idioma, String url, String doi, String universidad, String areaEstudio) {

		artcien.setId(id);
		artcien.setTitulo(titulo);
		artcien.setFecha(fecha);
		artcien.setIdioma(idioma);
		artcien.setUrl(url);
		artcien.setDoi(doi);
		artcien.setUniversidad(universidad);
		artcien.setAreaEstudio(areaEstudio);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new ArticuloCientifico(id, titulo, fecha, idioma, url, doi, universidad, areaEstudio);

				System.out.println("Datos del Articulo Cientifico guardados");
				break;
			}

		}

	}

	public static void listarLibro(Libro[] libro) {

		for (int i = 0; i < libro.length; i++) {
			if (libro[i] != null) {
				System.out.println("Publicacion de tipo Libro: " + " Pos. N°" + i + " Id: " + libro[i].getId()
						+ " Titulo: " + libro[i].getTitulo() + " Fecha: " + libro[i].getFecha() + " Idioma: "
						+ libro[i].getIdioma() + " URL: " + libro[i].getUrl() + " ISBN: " + libro[i].getIsbn()
						+ " Editorial: " + libro[i].getEditorial() + "Numero de Paginas: "
						+ libro[i].getNumeroPaginas());
			}
		}
	}

	public static void listarRevista(Revista[] revista) {

		for (int i = 0; i < revista.length; i++) {
			if (revista[i] != null) {
				System.out.println("Publicacion de tipo Revista: " + " Pos. N°" + i + " Id: " + revista[i].getId()
						+ " Titulo: " + revista[i].getTitulo() + " Fecha: " + revista[i].getFecha() + " Idioma: "
						+ revista[i].getIdioma() + " URL: " + revista[i].getUrl() + " ISSN: " + revista[i].getIssn()
						+ " Volumen: " + revista[i].getVolumen() + " Editor: " + revista[i].getEditor());
			}
		}

	}

	public static void listarArtcien(ArticuloCientifico[] artcien) {
		for (int i = 0; i < artcien.length; i++) {
			if (artcien[i] != null) {
				System.out.println("Publicacion de tipo Articulo cientifico: " + " Pos. N°" + i + " Id: "
						+ artcien[i].getId() + " Titulo: " + artcien[i].getTitulo() + " Fecha: " + artcien[i].getFecha()
						+ " Idioma: " + artcien[i].getIdioma() + " URL: " + artcien[i].getUrl() + " DOI: "
						+ artcien[i].getDoi() + " Universidad: " + artcien[i].getUniversidad() + " Area de Estudio: "
						+ artcien[i].getAreaEstudio());
			}
		}
	}

	public static void bajaLibro(Libro[] l, int bajaLibro) {

		for (int i = 0; i < l.length; i++) {

			if (l[i].getId() == bajaLibro) {
				l[i] = null;
				System.out.println("Publicacion de tipo Libro borrada.");
			}
			break;

		}
	}

	public static void bajaRevista(Revista[] r, int bajaRevista) {

		for (int i = 0; i < r.length; i++) {

			if (r[i].getId() == bajaRevista) {
				r[i] = null;
				System.out.println("Publicacion de tipo Revista borrado.");
			}
			break;

		}

	}

	public static void bajaArticulo(ArticuloCientifico[] art, int bajaArticulo) {

		for (int i = 0; i < art.length; i++) {

			if (art[i].getId() == bajaArticulo) {
				art[i] = null;
				System.out.println("Publicacion de tipo Articulo Cientifico borrado.");
			}
			break;

		}
	}

	public static void modificarLibro(Libro[] l, int idActual, int datoAModificar, int nuevoId,
			String tituloAModificar) {

		System.out.println("Id del Libro modificado: " + idActual);
		for (int i = 0; i < l.length; i++) {
			if (l[i] != null && l[i].getId() == idActual) {

				if (datoAModificar == 1) {
					l[i].setId(nuevoId);

				} else {

					l[i].setTitulo(tituloAModificar);
					;
					break;
				}

			}
		}
	}

	public static void modificarRevista(Revista[] elec, int idActual, int datoAModificar, int nuevoId,
			String tituloAModificar) {

		System.out.println("Id de Revista modificada: " + idActual);
		for (int i = 0; i < elec.length; i++) {
			if (elec[i] != null && elec[i].getId() == idActual) {

				if (datoAModificar == 1) {
					elec[i].setId(nuevoId);

				} else {

					elec[i].setTitulo(tituloAModificar);
					;
					break;
				}

			}
		}

	}

	public static void modificarArticulo(ArticuloCientifico[] art, int idActual, int datoAModificar, int nuevoId,
			String tituloAModificar) {

		System.out.println("Id de Articulo Cientifico modificado: " + idActual);
		for (int i = 0; i < art.length; i++) {
			if (art[i] != null && art[i].getId() == idActual) {

				if (datoAModificar == 1) {
					art[i].setId(nuevoId);

				} else {

					art[i].setTitulo(tituloAModificar);
					break;
				}

			}
		}
	}
}
