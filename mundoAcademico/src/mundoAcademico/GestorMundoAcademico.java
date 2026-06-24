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
			System.out.println("5°| Salir");
			System.out.println("Ingresar la opcion");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1: {
				System.out.println("Ingrese el id del Libro: ");
				int id = lector.nextInt();
				System.out.println("Ingrese el titulo del Libro: ");
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
				System.out.println("Ingrese el titulo de la Revista: ");
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
				System.out.println("Ingrese el editor de la Revista: ");
				String editor = lector.next();
				System.out.println("Datos ingresados correctamente");
				altaRevista(arregloRevista, revista1, id, titulo, fecha, idioma, url, issn, volumen, editor);
				break;

			}
			case 3: {

				System.out.println("Ingrese el id del Articulo Cientifico: ");
				int id = lector.nextInt();
				System.out.println("Ingrese el titulo del Articulo Cientifico: ");
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
			}
		} while (opcion != 5);
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

}
