package br.com.targettrust.bancott.dominio;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contas")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "numero")
	private long numero;

	@Column(name = "dv")
	private Integer dv;

	@Column(name = "saldo")
	private Double saldo;

	@JoinColumn(name = "fk_agencia_cliente", nullable = false, insertable = true, updatable = true)
	@ManyToOne
	private Cliente cliente;

	@Column(name = "dataAbertura")
	private Calendar dataAbertura;

	@JoinColumn(name = "fk_agencia_numero", nullable = false, insertable = true, updatable = true)
	@ManyToOne
	private Agencia agencia;

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Integer getDv() {
		return dv;
	}

	public void setDv(Integer dv) {
		this.dv = dv;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", dv=" + dv + ", saldo=" + saldo + ", cliente=" + cliente
				+ ", dataAbertura=" + dataAbertura + ", agencia=" + agencia + "]";
	}

}
