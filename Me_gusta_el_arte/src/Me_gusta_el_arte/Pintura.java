package Me_gusta_el_arte;

public class Pintura extends ObraArte {

	String movimArte;	
	String metodoPintura; //acuarela, pintura, lapices
	char tipoLienzo; // F, P, M
	
	public String getMovimArte() {
		return movimArte;
	}
	public void setMovimArte(String movimArte) {
		this.movimArte = movimArte;
	}
	public String getMetodoPintura() {
		return metodoPintura;
	}
	public void setMetodoPintura(String metodoPintura) {
		this.metodoPintura = metodoPintura;
	}
	public char getTipoLienzo() {
		return tipoLienzo;
	}
	public void setTipoLienzo(char tipoLienzo) {
		this.tipoLienzo = tipoLienzo;
	}
	
	public Pintura(String autor, String nombreObra, String fechaCompletado, String movimArte, String metodoPintura,
			char tipoLienzo) {
		super(autor, nombreObra, fechaCompletado);
		this.movimArte = movimArte;
		this.metodoPintura = metodoPintura;
		this.tipoLienzo = tipoLienzo;
	}
	
	
	}
	
	

