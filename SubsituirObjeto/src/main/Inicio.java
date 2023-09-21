package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Objeto;

public class Inicio {

	public static void main(String[] args) {

		List<Objeto> objetos = new ArrayList<Objeto>();

		String qtdObjeto = JOptionPane.showInputDialog("Quantos objetos deseja colocar na lista?");

		int totalObjeto = Integer.parseInt(qtdObjeto);

		for (int i = 1; i <= totalObjeto; i++) {
			Objeto objeto = new Objeto();
			String nomeObjeto = JOptionPane.showInputDialog("Qual é o nome do " + i + " objeto?");
			objeto.setNome(nomeObjeto);

			// adicionando os objetos na lista
			objetos.add(objeto);

		}

		// imprimindo no console os objetos da lista
		System.out.println("Lista de objetos:");
		for (Objeto objeto : objetos) {
			System.out.println(objeto.getNome());
		}

		String objetoTroca = JOptionPane.showInputDialog("Qual objeto da lista trocar?");
		// trocando o objeto da lista
		for (int j = 0; j < objetos.size(); j++) {

			/// pegando os objetos de cada posição na lista
			Objeto objeto = objetos.get(j);
			
			
			if (objeto.getNome().equalsIgnoreCase(objetoTroca)) {
				Objeto objetoTrocado = new Objeto();
				String novoObjeto = JOptionPane.showInputDialog("Qual é o nome do novo objeto?");
				objetoTrocado.setNome(novoObjeto);

				// atualizando a lista de objetos
				objetos.set(j, objetoTrocado);
			}

		}

		// imprimindo a lista de objetos atualizada
		System.out.println("\n Lista de objetos Atualizada:");
		for (Objeto objeto : objetos) {
			System.out.println(objeto.getNome());
		}

	}

}
