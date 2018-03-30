package web.jdbc.testes;

import web.jdbc.model.CategoriaRefeicao;

public class Teste {

	public static void main(String[] args) {
		/*try {
			CategoriaRefeicao cat = new CategoriaRefeicao();
			cat.setNomeCategoria("Suco");
			cat.criarCategoria(cat);
			System.out.println("Executado");	
		} catch (Exception e) {
			System.out.println("main" + e.getMessage());
		}*/
		
		try {
			CategoriaRefeicao cat = new CategoriaRefeicao();
			cat.removerCategoria(3);
			System.out.println("removido");
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
