package com.salao.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produtos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idProduto;
	
	private String nomeProduto;
	private Long qtd;
	private Long idCliente;
	private Double valorProduto;
	
	public Produtos() {
		
	}

	public Produtos(String nomeProduto, Long qtd, Long idCliente, Double valorProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.qtd = qtd;
		this.idCliente = idCliente;
		this.valorProduto = valorProduto;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Long getQtd() {
		return qtd;
	}

	public void setQtd(Long qtd) {
		this.qtd = qtd;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	

}
