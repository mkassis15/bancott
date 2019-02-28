package br.com.targettrust.bancott.dominio;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "transacoes")
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id")
	private Long id;

	@JoinColumn(name = "fk_conta_numero_origem", nullable = false, insertable = true, updatable = true, unique=false)
	@ManyToOne
	private Agencia agencia;

	@Column(name = "contaNumeroDestino")
	private Conta contaNumeroDestino;

	@Column(name = "tipo")
	private Integer tipo;

	@Column(name = "valor")
	private Double valor;

	@Column(name = "data")
	private Calendar data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Conta getContaNumeroOrigem() {
		return contaNumeroOrigem;
	}

	public void setContaNumeroOrigem(Conta contaNumeroOrigem) {
		this.contaNumeroOrigem = contaNumeroOrigem;
	}

	public Conta getContaNumeroDestino() {
		return contaNumeroDestino;
	}

	public void setContaNumeroDestino(Conta contaNumeroDestino) {
		this.contaNumeroDestino = contaNumeroDestino;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Transacao [id=" + id + ", contaNumeroOrigem=" + contaNumeroOrigem + ", contaNumeroDestino="
				+ contaNumeroDestino + ", tipo=" + tipo + ", valor=" + valor + ", data=" + data + "]";
	}

}
