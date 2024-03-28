package modelagem;

//Classe que representa  abstração das peças do computador
public class PecaComputador {

	private int codigoPeca;
	private String nomePeca;
	
	
	public PecaComputador(int codigoPeca, String nomePeca) {
		this.codigoPeca = codigoPeca;
		this.nomePeca = nomePeca;
		
	}
	public int getCodigoPeca() {
		return codigoPeca;
	}


	public void setCodigoPeca(int codigoPeca) {
		this.codigoPeca = codigoPeca;
	}


	public String getNomePeca() {
		return nomePeca;
	}


	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}
	@Override
	public String toString() {
		return this.nomePeca;
	}
    @Override
    public boolean equals(Object p) {
    	return ((PecaComputador)p).getNomePeca().equals(this.getNomePeca());
    }
}