package br.com.fiap.dao;
import br.com.fiap.model.Apolice;
import java.util.List;

public interface ApoliceDAO {

       void salvar(Apolice apolice);
       Apolice buscarPorId(int id);
       List<Apolice> listarTodas();
       void atualizar(Apolice apolice);
       void remover(int id);
}


