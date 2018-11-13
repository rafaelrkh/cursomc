package com.rafael.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
public class Produtos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cd_produto;
	private String ds_produto;
	private Double quantidade_estoque;
	
	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA", 
	           joinColumns = @JoinColumn(name = "cd_produto"),
	           inverseJoinColumns = @JoinColumn(name = "cd_categoria")) 
	private List<Categorias> categorias = new ArrayList<>();

	public Produtos() {

	}

	public Produtos(Integer cd_produto, String ds_produto, Double quantidade_estoque) {
		super();
		this.cd_produto = cd_produto;
		this.ds_produto = ds_produto;
		this.quantidade_estoque = quantidade_estoque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_produto == null) ? 0 : cd_produto.hashCode());
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
		Produtos other = (Produtos) obj;
		if (cd_produto == null) {
			if (other.cd_produto != null)
				return false;
		} else if (!cd_produto.equals(other.cd_produto))
			return false;
		return true;
	}

	public Integer getCd_produto() {
		return cd_produto;
	}

	public void setCd_produto(Integer cd_produto) {
		this.cd_produto = cd_produto;
	}

	public String getDs_produto() {
		return ds_produto;
	}

	public void setDs_produto(String ds_produto) {
		this.ds_produto = ds_produto;
	}

	public Double getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(Double quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	public List<Categorias> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categorias> categorias) {
		this.categorias = categorias;
	}
	
	

}