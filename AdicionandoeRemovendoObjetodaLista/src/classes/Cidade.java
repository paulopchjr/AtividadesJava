package classes;

import java.util.ArrayList;
import java.util.List;

public class Cidade {

	private String nome;
	private String cep;
	
	private List<Pessoa>pessoas = new ArrayList<Pessoa>();

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
	public String teste() {
		String dados = "";
		
		for (Pessoa pessoa : pessoas) {
			dados = pessoa.getNome();
		}
		
		return dados;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", pessoas=" + this.teste() + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
