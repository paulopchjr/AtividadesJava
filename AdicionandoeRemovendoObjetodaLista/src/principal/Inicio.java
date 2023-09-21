package principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Cidade;
import classes.Pessoa;

public class Inicio {

	public static void main(String[] args) {

		String qtdPessoa = JOptionPane.showInputDialog("Quantas pessoas deseja cadastrar?");

		int totalPessoa = Integer.parseInt(qtdPessoa);

		List<Cidade> cidades = new ArrayList<Cidade>();

		for (int p = 1; p <= totalPessoa; p++) {

			Pessoa pessoa = new Pessoa();
			String nomePessoa = JOptionPane.showInputDialog("Qual é o nome da Pessoa " + p + "º ? ");
			pessoa.setNome(nomePessoa);
			String idadePessoa = JOptionPane.showInputDialog("Qual é o nome da idade " + pessoa.getNome() + "º ? ");
			pessoa.setIdade(Integer.parseInt(idadePessoa));

			Cidade cidade = new Cidade();
			String cidadePessoa = JOptionPane.showInputDialog("Qual é a cidade da pessoa: " + pessoa.getNome() + " ? ");
			cidade.setNome(cidadePessoa);
			String cepCidadePessoa = JOptionPane.showInputDialog("Qual é a CEP" + cidade.getNome() + " ? ");
			cidade.setCep(cepCidadePessoa);

			// adicionando as pessoas na cidade
			cidade.getPessoas().add(pessoa);

			// adicionando a cidade na lista
			cidades.add(cidade);

		}
		for (int i = 0; i < cidades.size(); i++) {
			Cidade cidade = cidades.get(i);
			System.out.println(cidade);
			
			
			

		}
	}
}
