package br.com.fiap.service;

import br.com.fiap.model.Cliente;

public interface ClienteService {

        void salvarCliente(Cliente cliente);
        Cliente buscarClientePorId(int id);
        void atualizarCliente(Cliente cliente);
        void deletarCliente(int id);

}
