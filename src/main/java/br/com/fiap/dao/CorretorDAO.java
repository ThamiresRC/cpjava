package br.com.fiap.dao;
import br.com.fiap.model.Corretor;
import java.util.List;

public interface CorretorDAO {

       void salvar(Corretor corretor);
       Corretor buscarPorId(int id);
       List<Corretor> listarTodos();
       void atualizar(Corretor corretor);
       void remover(int id);
}

