package entity;

public class Produto {

	private String nomeProduto;
	private String descricao;
	private Double preco;
	private Integer quantidade;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(String nomeProduto, String descricao, Double preco, Integer quantidade) {
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", descricao=" + descricao + ", preco=" + preco + ", quantidade="
				+ quantidade + "]";
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
