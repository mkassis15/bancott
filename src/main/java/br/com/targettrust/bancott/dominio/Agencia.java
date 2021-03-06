package br.com.targettrust.bancott.dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agencias")
public class Agencia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "numero")
	private Long numero;

	@Column(name = "nome")
	private String nome;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "cnpj")
	private String cnpj;

	@OneToMany(mappedBy = "agencia")
	private List<Conta> contas;

	public void setnumero(Long numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Agencia [numero=" + numero + ", nome=" + nome + ", endereco=" + endereco + ", cnpj=" + cnpj
				+ ", contas=" + contas + "]";
	}

	
}
