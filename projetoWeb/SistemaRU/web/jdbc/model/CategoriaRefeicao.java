package web.jdbc.model;
import java.util.Vector;

import web.jdbc.dao.CategoriaRefeicaoDAO;

public class CategoriaRefeicao {
    private int idCategoria;
    private String nomeCategoria;
    private CategoriaRefeicaoDAO daoCategoria = CategoriaRefeicaoDAO.getInstancia();

    public CategoriaRefeicao() {

    }

    public void criarCategoria(CategoriaRefeicao addCategoria) {
        try {
            CategoriaRefeicao novaCategoria = new CategoriaRefeicao();
            novaCategoria.setNomeCategoria(addCategoria.getNomeCategoria());
            daoCategoria.addCategoriaDAO(novaCategoria);

        } catch (Exception e) {
            System.out.println("categoria refeicao" + e.getMessage());
        }
    }

    public Vector<CategoriaRefeicao> listarCategoria() throws Exception {
        CategoriaRefeicaoDAO con = new CategoriaRefeicaoDAO();
        Vector<CategoriaRefeicao> aux = con.listarCategoria();
        return aux;

    }

    public void removerCategoria(int removerCategoria) {
        try {
            daoCategoria.removerCatedogiaDAO(removerCategoria);
        } catch (Exception e) {
            System.out.println("remover categoria" + e.getMessage());
        }
    }

    //METODOS GETTERS E SETTERS
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

	
}
