package br.com.meutrabalho.estoque.estoque;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.meutrabalho.estoque.util.BaseEntity;

@Entity(name = "estoque")
public class Estoque extends BaseEntity {

	@Column(name = "descricao", nullable = false)
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}