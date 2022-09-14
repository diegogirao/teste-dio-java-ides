package br.com.alura.mod;

import java.util.Objects;

public class Gato {
	private Integer idade;
	private String cor;
	private String nome;

	public Gato() {
	}

	public Gato(Integer idade, String cor, String nome) {
		this.idade = idade;
		this.cor = cor;
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [idade=" + idade + ", cor=" + cor + ", nome=" + nome + ", getIdade()=" + getIdade() + ", getCor()="
				+ getCor() + ", getNome()=" + getNome() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	/*
	 * public Gato(String nome, String cor, Integer idade) { this.nome = nome;
	 * this.cor = cor; this.idade = idade; }
	 */

}
