package br.com.opet.controller;

import java.util.ArrayList;

import br.com.opet.model.Produto;
import br.com.opet.view.TelaProduto;

public class GerenciarProduto {

	ArrayList<Produto> alProduto = new ArrayList<Produto>();
	TelaProduto tProduto = new TelaProduto();

	public void cadastrar() throws Exception {
		alProduto.add(tProduto.showCadastrar());
	}

	public void listar() {
		for (Produto p : alProduto) {
			tProduto.showProduto(p);
		}
	}
}