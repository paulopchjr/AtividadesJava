package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import classes.ItemProdutoVenda;
import classes.Produto;
import classes.Vendas;

public class Inicio {

	public static void main(String[] args) {

		int acao1 = JOptionPane.showConfirmDialog(null, "Deseja realizar uma venda?");

		if (acao1 == 0) {
			List<ItemProdutoVenda> itemProdutoVendas = new ArrayList<ItemProdutoVenda>();
			List<Produto>produtos = new ArrayList<Produto>();
			String info = JOptionPane.showInputDialog("Informe Cadastro");
			Vendas venda = new Vendas();
			Random codigoVenda = new Random();

			venda.setCodigo(codigoVenda.nextInt());/// numero qualquer da venda
			for (int i = 0; i < Integer.parseInt(info); i++) {
				// System.out.println("Posicão do vetor é = " + (i+1));
				Produto produto = new Produto();
				ItemProdutoVenda itemProdutoVenda = new ItemProdutoVenda();
				String nomeProduto = JOptionPane.showInputDialog(" Qual é o nome do produto " + (i + 1) + "?");
				String ValorProduto = JOptionPane.showInputDialog(" Qual é o valor do produto " + (i + 1) + "?");
				String quantidadeItem = JOptionPane.showInputDialog("Quantidade do item " + (i + 1) + "?");
				itemProdutoVenda.setQuantidadeItem(Integer.parseInt(quantidadeItem));
				produto.setNome(nomeProduto);
				produto.setValor(Double.parseDouble(ValorProduto));
				produtos.add(produto);
				itemProdutoVenda.getProdutos().add(produto); // adicionando o produto na lista dos itens do objeto
				itemProdutoVenda.TotalProduto();
				itemProdutoVendas.add(itemProdutoVenda); // adicionando os item um por vez na lista de itens

			}

			System.out.println("Venda: " + venda.getCodigo());

			for (int x = 0; x < itemProdutoVendas.size(); x++) {
				ItemProdutoVenda itv = itemProdutoVendas.get(x);
				
				System.out.println("Descrição : " + itv.Result());
				
			}
			
			
				
			

		} else {
			JOptionPane.showMessageDialog(null, "Ação finalizada");
		}
	}

}
