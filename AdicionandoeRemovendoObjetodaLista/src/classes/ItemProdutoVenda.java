package classes;

import java.util.ArrayList;
import java.util.List;

public class ItemProdutoVenda extends Produto {

	private String DataVenda;
	private int quantidadeItem;

	private List<Produto> produtos = new ArrayList<Produto>();
	private List<Vendas> vendas = new ArrayList<Vendas>();

	public List<Vendas> getVendas() {
		return vendas;
	}

	public void setVendas(List<Vendas> vendas) {
		this.vendas = vendas;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getDataVenda() {
		return DataVenda;
	}

	public void setDataVenda(String dataVenda) {
		DataVenda = dataVenda;
	}

	public int getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}

	public double TotalProduto() {
		double total = 0.0;
		for (Produto produto : produtos) {

			total += this.quantidadeItem * produto.getValor();
		}
		return total;

	}

	public String Result() {
		String dados = "";
		for (Produto produto : produtos) {
			dados = " Nome do Produto: " + produto.getNome();
			dados += "\n Valor: " + produto.getValor();
			dados += "\n qtd: " + this.quantidadeItem;
			dados += "\n total: " + this.TotalProduto() + "\n";
		}
		return dados;
	}

	@Override
	public String toString() {
		return "ItemProdutoVenda [DataVenda=" + DataVenda + ", quantidadeItem=" + quantidadeItem + ", produtos="
				+ produtos + ", vendas=" + vendas + "]";
	}

}
