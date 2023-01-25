package com.algaworks.estoque;

import java.math.BigDecimal;

public class Produto {

	public enum Status {
		ATIVO, INATIVO
	}

	private String nome;
	private BigDecimal preco;
	private int quantidade;
	private Status status = Status.ATIVO;

	public Produto(String nome) {
		this.nome = nome;
	}

	public Produto(String nome, BigDecimal preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(String nome, BigDecimal preco, int quantidade, Status status) {
		this(nome, preco, quantidade);
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
    public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Status getStatus() {
		return status;
	}

	public void inativar() {
		status = Status.INATIVO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto{" +
				"nome='" + nome + '\'' +
				", preco=" + preco +
				", quantidade=" + quantidade +
				", status=" + status +
				'}';
	}

}