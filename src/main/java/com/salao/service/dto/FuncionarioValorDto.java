package com.salao.service.dto;

public class FuncionarioValorDto {
	
	private Double vlTotal;
	private String nmFuncionario;
	private Double comissao;

	public FuncionarioValorDto() {
	}
	
	public FuncionarioValorDto(Double vlTotal, String nmFuncionario, Double comissao) {
		super();
		this.vlTotal = vlTotal;
		this.nmFuncionario = nmFuncionario;
		this.comissao = comissao;
	}

	public Double getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(Double vlTotal) {
		this.vlTotal = vlTotal;
	}

	public String getNmFuncionario() {
		return nmFuncionario;
	}

	public void setNmFuncionario(String nmFuncionario) {
		this.nmFuncionario = nmFuncionario;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	
	

}
