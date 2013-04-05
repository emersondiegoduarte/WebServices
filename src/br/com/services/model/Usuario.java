package br.com.services.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7522193326298094398L;

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USUARIO_ORIGEM", joinColumns = @JoinColumn(name = "USUARIO_ID"), inverseJoinColumns = @JoinColumn(name = "ORIGEM_ID"))
	private Collection<Origem> origens;

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

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Collection<Origem> getOrigens() {
		return origens;
	}

	public void setOrigens(Collection<Origem> origens) {
		this.origens = origens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
