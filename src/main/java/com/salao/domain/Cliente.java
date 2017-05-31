package com.salao.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCliente; 
	
	@Column(name = "nome_cliente")
	private String nomeCliente;
 
	@Column(name = "endereco")
	private String endereco;

	@Column(name = "data_nascimento")
	private Date   dataNascimento;
	
	@Column(name = "cpf")
	private String cpf;

	@Column(name = "email")
	private String email;

	@Column(name = "telefone")
	private String telefone;

;
	
	public Cliente() {
	}

	public Cliente(Long idCliente, String nomeCliente, String endereco, Date dataNascimento, String cpf, String email,
			String telefone) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	
	

	
}
