package br.com.opet.view;

import com.opet.util.Reader;

import br.com.opet.model.Produto;

public class TelaProduto {
	public Produto showCadastrar() throws Exception {
		System.out.println("=====================");
		System.out.print("Id: ");
		int id = Reader.readInt();
		System.out.print("Descricao: ");
		String desc = Reader.readString();
		System.out.print("Preco: ");
		double preco = Reader.readDouble();
		System.out.println("=====================");
		Produto pdt = new Produto(id, desc, preco);
		return pdt;
	}

	public void showProduto(Produto p) {
		System.out.println(p.getId() + " - " + p.getDescricao() + " - " + p.getPreco());
	}
}