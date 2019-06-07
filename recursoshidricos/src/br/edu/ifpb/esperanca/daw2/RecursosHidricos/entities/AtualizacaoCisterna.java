package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AtualizacaoCisterna implements Identificavel {

	@Id
	private Long id_atualiza��o;
	private Date periodo_agua_atualizada;

	@ManyToOne
	private Cisterna capacidade_cisterna;

	@ManyToOne
	private Cisterna quant_litros_agua;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	public Long getId_atualiza��o() {
		return id_atualiza��o;
	}

	public void setId_atualiza��o(Long id_atualiza��o) {
		this.id_atualiza��o = id_atualiza��o;
	}

	public Date getPeriodo_agua_atualizada() {
		return periodo_agua_atualizada;
	}

	public void setPeriodo_agua_atualizada(Date periodo_agua_atualizada) {
		this.periodo_agua_atualizada = periodo_agua_atualizada;
	}

	public Cisterna getCapacidade_cisterna() {
		return capacidade_cisterna;
	}

	public void setCapacidade_cisterna(Cisterna capacidade_cisterna) {
		this.capacidade_cisterna = capacidade_cisterna;
	}

	public Cisterna getQuant_litros_agua() {
		return quant_litros_agua;
	}

	public void setQuant_litros_agua(Cisterna quant_litros_agua) {
		this.quant_litros_agua = quant_litros_agua;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacidade_cisterna == null) ? 0 : capacidade_cisterna.hashCode());
		result = prime * result + ((id_atualiza��o == null) ? 0 : id_atualiza��o.hashCode());
		result = prime * result + ((periodo_agua_atualizada == null) ? 0 : periodo_agua_atualizada.hashCode());
		result = prime * result + ((quant_litros_agua == null) ? 0 : quant_litros_agua.hashCode());
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
		AtualizacaoCisterna other = (AtualizacaoCisterna) obj;
		if (capacidade_cisterna == null) {
			if (other.capacidade_cisterna != null)
				return false;
		} else if (!capacidade_cisterna.equals(other.capacidade_cisterna))
			return false;
		if (id_atualiza��o == null) {
			if (other.id_atualiza��o != null)
				return false;
		} else if (!id_atualiza��o.equals(other.id_atualiza��o))
			return false;
		if (periodo_agua_atualizada == null) {
			if (other.periodo_agua_atualizada != null)
				return false;
		} else if (!periodo_agua_atualizada.equals(other.periodo_agua_atualizada))
			return false;
		if (quant_litros_agua == null) {
			if (other.quant_litros_agua != null)
				return false;
		} else if (!quant_litros_agua.equals(other.quant_litros_agua))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AtualizacaoCisterna [id_atualiza��o=" + id_atualiza��o + ", periodo_agua_atualizada="
				+ periodo_agua_atualizada + ", capacidade_cisterna=" + capacidade_cisterna + ", quant_litros_agua="
				+ quant_litros_agua + "]";
	}

	public AtualizacaoCisterna() {
		super();
	}

	public AtualizacaoCisterna(Long id_atualiza��o, Date periodo_agua_atualizada, Cisterna capacidade_cisterna,
			Cisterna quant_litros_agua) {
		super();
		this.id_atualiza��o = id_atualiza��o;
		this.periodo_agua_atualizada = periodo_agua_atualizada;
		this.capacidade_cisterna = capacidade_cisterna;
		this.quant_litros_agua = quant_litros_agua;
	}
	

	

}
