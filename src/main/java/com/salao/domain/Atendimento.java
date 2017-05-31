package com.salao.domain;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
public class Atendimento implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cd_atendimento; 
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_funcionario")
	private Funcionario funcionario;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_servico")
	private Servicos servicos;
	
	@Column
	private Date data_atendimento;
	
	public Atendimento() {
	}

	public Atendimento(Long cd_atendimento, Cliente cliente, Funcionario funcionario, Servicos servicos,
			Date data_atendimento) {
		super();
		this.cd_atendimento = cd_atendimento;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.servicos = servicos;
		this.data_atendimento = data_atendimento;
	}

	public Long getCd_atendimento() {
		return cd_atendimento;
	}

	public void setCd_atendimento(Long cd_atendimento) {
		this.cd_atendimento = cd_atendimento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Servicos getServicos() {
		return servicos;
	}

	public void setServicos(Servicos servicos) {
		this.servicos = servicos;
	}

	public Date getData_atendimento() {
		return data_atendimento;
	}

	public void setData_atendimento(Date data_atendimento) {
		this.data_atendimento = data_atendimento;
	}

	
	
}
