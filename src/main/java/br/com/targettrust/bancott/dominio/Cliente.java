package br.com.targettrust.bancott.dominio;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id")
	private Long id;

	@OneToMany(mappedBy = "conta")
	private List<Conta> contas;
	
	@Column(name = "nome")

	private String nome;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "dataNascimento")
	private Calendar dataNascimento;

	@Column(name = "nomeMae")
	private String nomeMae;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", cpf="
				+ cpf + ", dataNascimento=" + dataNascimento + ", nomeMae=" + nomeMae + "]";
	}

}
