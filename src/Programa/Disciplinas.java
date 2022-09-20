package Programa;

public class Disciplinas {
	private int codigo;
	private String nome;
	private int fase;
	private Double carga;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getFase() {
		return fase;
	}
	public void setFase(int fase) {
		this.fase = fase;
	}
	public Double getCarga() {
		return carga;
	}
	public void setCarga(Double carga) {
		this.carga = carga;
	}
	
	@Override
	public String toString() {
		return "Disciplinas [codigo=" + codigo + ", nome=" + nome + ", fase=" + fase + ", carga=" + carga + "]";
	}
	
}
