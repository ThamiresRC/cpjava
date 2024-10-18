package br.com.fiap.dao;
import br.com.fiap.model.Seguro;
import java.util.List;

public interface SeguroDAO {

        void salvar(Seguro seguro);
        Seguro buscarPorId(int id);
        List<Seguro> listarTodos();
        void atualizar(Seguro seguro);
        void remover(int id);
}


