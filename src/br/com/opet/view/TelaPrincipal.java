package br.com.opet.view;

import com.opet.util.Reader;

public class TelaPrincipal {
	public int showMenu() throws Exception {
		int opc = -1;
		System.out.println("=====================");
		System.out.println("1 - Produto");
		System.out.println("2 - Listar");
		System.out.println("0 - Sair");
		System.out.println("=====================");
		opc = Reader.readInt();
		return opc;
	}
}