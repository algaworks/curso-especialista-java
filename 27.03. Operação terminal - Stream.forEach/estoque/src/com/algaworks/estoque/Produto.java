package com.algaworks.estoque;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Produto {

	public enum Status {
		ATIVO, INATIVO
	}

	private String nome;
	private BigDecimal preco;
	private int quantidade;
	private Status status = Status.ATIVO;
	private final Fabricante fabricante;
	private final Set<Categoria> categorias = new HashSet<>();
	
	public Produto(String nome, BigDecimal preco, int quantidade,
				   Fabricante fabricante, Categoria... categorias) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.fabricante = fabricante;
		this.categorias.addAll(Set.of(categorias));
	}

	public Produto(String nome, BigDecimal preco, int quantidade,
				   Fabricante fabricante, Status status, Categoria... categorias) {
		this(nome, preco, quantidade, fabricante, categorias);
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public Set<Categoria> getCategorias() {
		return Collections.unmodifiableSet(categorias);
	}

	public Status getStatus() {
		return status;
	}

	public void inativar() {
		status = Status.INATIVO;
	}

	public void ativar() {
		status = Status.ATIVO;
	}

	public boolean isAtivo() {
		return Status.ATIVO.equals(status);
	}

	public boolean isInativo() {
		return Status.INATIVO.equals(status);
	}

	public void adicionarCategoria(Categoria categoria) {
		this.categorias.add(categoria);
	}

	public void removerCategoria(Categoria categoria) {
		this.categorias.remove(categoria);
	}

	public boolean temEstoque() {
		return getQuantidade() > 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
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

}
