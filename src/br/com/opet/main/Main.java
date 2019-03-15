package br.com.opet.main;

import br.com.opet.controller.GerenciarProduto;
import br.com.opet.view.TelaPrincipal;

public class Main {

	public static void main(String[] args) throws Exception {
		int opc = -1;

		TelaPrincipal mainMenu = new TelaPrincipal();
		GerenciarProduto cProduto = new GerenciarProduto();

		while (opc != 0) {
			opc = mainMenu.showMenu();
			switch (opc) {
			case 1:
				cProduto.cadastrar();
				break;
			case 2:
				cProduto.listar();
				break;
			default:
				System.out.println("Opcao Invalida!");
				break;
			}
		}
	}
}