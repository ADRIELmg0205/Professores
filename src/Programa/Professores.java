package Programa;

import java.util.Arrays;

public class Professores {
	private int codigo;
	private String nome;
	private Disciplinas[] disciplinas;
	
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
	public Disciplinas[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(Disciplinas[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public Double SomaCarga() {
		Double soma = 0.0;
		for(int cont = 0; cont < this.disciplinas.length; cont++) {
			soma = soma + disciplinas[cont].getCarga();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		return "Professores [codigo=" + codigo + ", nome=" + nome + ", disciplinas=" + Arrays.toString(disciplinas)
				+ ", Carga Horaria = " + SomaCarga() + "]";
	}	
	
}
