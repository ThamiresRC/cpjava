package br.com.fiap.dao;
import br.com.fiap.model.Cliente;
import java.util.HashMap;
import java.util.Map;

public class ClienteDaoImplements implements ClienteDAO{

    private Map<Integer, Cliente> clientes = new HashMap<>();

    private static ClienteDaoImplements instanciaSingleton;

    private ClienteDaoImplements() {}

    public static ClienteDaoImplements getInstance() {  
        if (instanciaSingleton == null) {
            instanciaSingleton = new ClienteDaoImplements();
        }
        return instanciaSingleton;
    }

        @Override
        public void salvar(Cliente cliente) {
            clientes.put(cliente.getId(), cliente);
            System.out.println("Cliente salvo: " + cliente.getNome());
        }

        @Override
        public Cliente buscarPorId(int id) {
            return clientes.get(id);
        }

        @Override
        public void atualizar(Cliente cliente) {
            if (clientes.containsKey(cliente.getId())) {
                clientes.put(cliente.getId(), cliente);
                System.out.println("Cliente atualizado: " + cliente.getNome());
            }
        }

        @Override
        public void deletar(int id) {
            clientes.remove(id);
            System.out.println("Cliente removido com ID: " + id);
        }
  }
