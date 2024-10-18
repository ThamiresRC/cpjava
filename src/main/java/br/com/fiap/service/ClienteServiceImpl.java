package br.com.fiap.service;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ClienteDaoImplements;
import br.com.fiap.model.Cliente;

class ClienteServiceImpl implements ClienteService {


  private ClienteDAO clienteDAO = ClienteDaoImplements.getInstance();  

  private static ClienteServiceImpl instanciaSingleton;

  private ClienteServiceImpl() {}

  public static ClienteServiceImpl getInstance() {
   if (instanciaSingleton == null) {
    instanciaSingleton = new ClienteServiceImpl();
   }
   return instanciaSingleton;
  }

  @Override
  public void salvarCliente(Cliente cliente) {
   clienteDAO.salvar(cliente);
  }

  @Override
  public Cliente buscarClientePorId(int id) {
   return clienteDAO.buscarPorId(id);
  }

  @Override
  public void atualizarCliente(Cliente cliente) {
   clienteDAO.atualizar(cliente);
  }

  @Override
  public void deletarCliente(int id) {
   clienteDAO.deletar(id);
  }
 }

