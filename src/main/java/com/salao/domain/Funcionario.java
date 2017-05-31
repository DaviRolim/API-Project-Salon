package com.salao.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;

import com.salao.service.dto.FuncionarioValorDto;

@SqlResultSetMapping(name= "FuncionarioValorDtoMapping", classes = {
        @ConstructorResult(targetClass = FuncionarioValorDto.class,
            columns = {
                @ColumnResult(name="vlTotal",type = Double.class),
                @ColumnResult(name="nmFuncionario",type = String.class),
                @ColumnResult(name="comissao",type = Double.class)
            }
        )
    })
@Entity
public class Funcionario implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idFuncionario;
	
	@Column
	private String nomeFuncionario;
	@Column
	private String endereco;
	@Column
	private Date dataNascimento;
	@Column
	private String cpf;
	@Column
	private String email;
	@Column
	private String telefone;
	@Column
	private String cargo;

	
	
	public Funcionario() {
	}

	public Funcionario(String nomeFuncionario, String endereco, Date dataNascimento, String cpf, String email, String telefone,
			String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.cargo = cargo;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	
	
	
	
}
